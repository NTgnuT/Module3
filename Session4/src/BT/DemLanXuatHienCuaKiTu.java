package BT;

import java.util.Scanner;

public class DemLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String name = scanner.nextLine();

        System.out.println(name);
        System.out.println("Nhập ký tự cần đếm trong chuỗi: ");
        char kt = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == kt){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+kt+" trong chuỗi là: " +count+ " lần");
    }

}
