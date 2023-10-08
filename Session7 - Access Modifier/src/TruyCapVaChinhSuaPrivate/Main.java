package TruyCapVaChinhSuaPrivate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập: ");
        String input = scanner.nextLine();
        myClass.setMyString(input);

        System.out.println("Dữ liệu của bạn: " + myClass.getMyString());
    }
}
