package TH;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email:");

        while (true) {
            String email = scanner.nextLine();
            String validate = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$;";

            // so chuỗi dữ liệu đầu vào với đối tượng Pattern đã được tạo trước
            System.out.println("Kiểm tra email: " + Pattern.matches(validate,email));


            if (Pattern.matches(validate,email)) {
                System.out.println("Email hợp lệ");
                break;
            } else {
                System.err.println("Email không đúng định dạng, mời nhập lại ");
            }
        }
    }
}
