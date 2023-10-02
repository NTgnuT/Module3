import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bước 1: Khai báo 3 biến là 3 cạnh của tam giác.
        System.out.println("Nhập 3 cạnh của 1 tam giác");
        System.out.println("Nhập cạnh a:");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b:");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c:");
        int c = sc.nextInt();
        double S;
        double p;
//
//Bước 2: Sử dụng vòng lặp while lặp vô hạn và cho người dùng nhập vào giá trị của 3 cạnh tam giác .
        while (true) {
            //Kiểm tra xem 3 cạnh người dùng nhập vào có thoả mãn điều kiện của 1 tam giác không :
            //3 cạnh phải > 0.
            if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b) {
                //tổng của 2 cạnh phải lớn hơn cạnh còn lại

                //Nếu thoả mãn điều kiện trên thì tính chu vi và diện tích và dừng vòng lặp lại .
                p = (a + b + c);
                System.out.println("Chu vi là: " + p);
                S = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 10) / 10.0;
                System.out.println("Diện tích là: " + S);
            }else{
                    //Nếu không thoả mãn thì hiển thị ra lỗi và bắt người dùng nhập lại.
                    System.out.println("Không thỏa mãn điều kiện tạo nên tam giác");
            }
            break;
        }

//Bước 3: HIển thị kết quả ra màn hình
    }
}
