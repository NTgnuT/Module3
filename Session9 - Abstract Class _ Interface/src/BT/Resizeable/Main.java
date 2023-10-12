package BT.Resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Circle circle = new Circle();
//        System.out.println(circle);
//        System.out.println("Nhập bán kính");
//        double r = Double.parseDouble(scanner.nextLine());
//        circle.setRadius(r);
//        System.out.println(circle);
//        System.out.println("Nhập tỉ lệ kích thước bạn muốn tăng: ");
//        double up = Double.parseDouble(scanner.nextLine());
//        circle.Resize(up);
//        System.out.println(circle);

        Shape [] shapes = new Shape[3];

        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6.0);
        for (Shape shape:shapes){
            System.out.println(shape);
        }

        for (Shape shape:shapes) {
            double percent = Math.round(Math.random() * 99 + 1);
            shape.Resize(percent);
            System.out.println(shape);
        }
    }
}
