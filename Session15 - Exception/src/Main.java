import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao 2 so ");
            System.out.println("Nhap so a: ");
            Integer a = Integer.valueOf(scanner.nextLine());
            System.out.println("Nhap so b: ");
            Integer b = Integer.valueOf(scanner.nextLine());
            System.out.println("a chia b  = " + a/b);
        } catch (ArithmeticException a) {
            System.err.println("Khong the chia cho 0");
        } catch (NumberFormatException n) {
            System.err.println("Du lieu nhap vao khong phai la so");
        } finally {
            System.out.println("Ket thuc chuong trinh!");
        }
    }
}