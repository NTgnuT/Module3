import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị bạn cần tính:");
        double side = scanner.nextDouble();

        double perimeter = side * 4;
        System.out.println("Chu vi của hình vuông là: " + perimeter);
        double area = side * side;
        System.out.println("Diện tích của hình vuông là: " + area);

    }
}
