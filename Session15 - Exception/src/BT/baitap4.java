package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần chuyển đổi.");
        String str = scanner.nextLine();
        changeStringToInteger(str);
    }

    public static void changeStringToInteger (String str) {
        List<Integer> list = new ArrayList<>();
        String[] s = str.split(" ");

        for (int i = 0; i < s.length; i++) {
            try {
                int number = Integer.parseInt(s[i]);
                list.add(number);
            } catch (NumberFormatException n) {
                list.add(0);
                System.out.println("Ký tự " + s + "không phải số nguyên được thay thế bằng số 0");
            }
        }

    }

}
