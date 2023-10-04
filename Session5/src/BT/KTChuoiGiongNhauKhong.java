package BT;

import java.util.Scanner;

public class KTChuoiGiongNhauKhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi thứ 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ 2: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("2 chuỗi trên giống nhau");
        } else {
            System.out.println("Hay chuỗi trên khác nhau");
        }
    }
}
