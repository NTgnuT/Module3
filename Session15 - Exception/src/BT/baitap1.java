package BT;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           try {
               System.out.println("Nhập 2 số nguyên a, b để tính tổng.");
               System.out.println("Nhập số nguyên a: ");
               int a = Integer.parseInt(scanner.nextLine());
               System.out.println("Nhập số nguyên b: ");
               int b = Integer.parseInt(scanner.nextLine());
               System.out.println("Tổng a + b = " + (a+b));
               break;
           } catch (NumberFormatException n) {
               System.err.println("Bạn vừa nhập không phải số nguyên. Mời nhập lại");
           }
       }
    }
}
