public class BT4 {
    public static void main(String[] args) {
//        Bước 1: Khai báo biến số nguyên numbers
//        và nhập cho nó một giá trị từ bàn phím để lưu số lượng số nguyên tố cần in ra.
        int number = 20;

//        Bước 2: Khai báo biến count và gán cho nó giá trị 0,
//        biến này để đếm xem số lượng lượng số nguyên tố cần in ra đã bằng numbers hay chưa.
        int count = 0;

//        Bước 3: Khai báo biến N và gán cho giá trị 2,
//        biến này để kiểm tra xem các giá trị nó nhận được có phải là số nguyên tố không,
//        mỗi lần lặp giá trị của biến sẽ được tăng lên 1.
        int n = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n ; i++) {
                if (n % i == 0) {
                    check = false;
                }

            }
            if(check) {
                System.out.print( n + ", " );
                count ++;
            }
            n++;
        }

    }
}
