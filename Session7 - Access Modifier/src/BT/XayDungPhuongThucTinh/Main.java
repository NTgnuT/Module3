package BT.XayDungPhuongThucTinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính của hình tròn");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tròn là: " + StaticMethod.calCircleArea(r));

        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình chữ nhật là: " + StaticMethod.calRectangleArea(width, height));

        System.out.println("Nhập vào các cạnh của hình tam giác");
        System.out.println("Cạnh a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Cạnh b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Cạnh c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tam giác là: " + StaticMethod.calTriangleArea(a, b, c));
    }
}
