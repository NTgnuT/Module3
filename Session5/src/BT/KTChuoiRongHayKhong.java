package BT;

import java.util.Scanner;

public class KTChuoiRongHayKhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        boolean check = str.isEmpty();

        if (check) {
            System.out.println("Chuỗi không rỗng");
        } else {
            System.out.println("Chuỗi rỗng");
        }

    }
}
