package TH;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập tên tài khoản: ");
            String account = scanner.nextLine();
            String validate = "^[_a-z0-9]{6,}$";

            System.out.println("Kiểm tra tên tài khoản: " + Pattern.matches(validate,account));

            if (Pattern.matches(validate,account)) {
                System.out.println("Tên tài khoản hợp lệ");
                break;
            } else {
                System.err.println("Tên tài khoản không hợp lệ");
            }
        }
    }
}
