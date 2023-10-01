import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là:" + name);
    }
}