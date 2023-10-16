package BT;

import java.util.Scanner;
import java.util.Stack;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng từ bạn muốn nhập: ");
        int n = Integer.parseInt(scanner.nextLine());

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập từ thứ " + (i+1));
            String in = scanner.nextLine();
            stack.push(in);
        }

        System.out.println("Các từ theo thứ tự đảo ngược");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack);
            break;
        }

    }
}
