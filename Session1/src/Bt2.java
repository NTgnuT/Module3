import java.util.Scanner;

public class Bt2 {
//    Bước 1: Tạo dự án mới và khai báo hàm main()
    public static void main(String[] args) {

//        Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ
//        giá có thể là 23000 VND/USD.
        int rate = 23000 ;
        int usd;

//        Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi");
        usd = scanner.nextInt(); //gán giá trị


//        Bước 4: Tính giá trị VND và hiển thị ra màn hình.
        int total = rate * usd ;
        System.out.println("Số tiền chuyển đổi là " + total);

    }
}
