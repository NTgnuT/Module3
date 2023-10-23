package BT;

import java.util.Objects;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object [] a = {1, 2, "một", 3, "hai", 4};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            try {
                sum = sum + (int)a[i];
            } catch (ClassCastException n) {
                System.out.println(a[i] + " không phải là số nguyên");
            }
        }

        System.out.println("Tổng các số nguyên là: " + sum);

    }
}
