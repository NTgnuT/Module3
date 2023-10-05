package BT.XayDungLopHinhTron;

import java.util.Scanner;

public class Circle {
    // 1.Fields
    private double radius;

    private String color;

    // 2.Constructors
    public Circle () {

    }

    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // 3. Methods
    // 3.1 getter and setter

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public double perimeter () {
        return 2 * Math.PI * radius;
    }

     public double area () {
        return Math.PI * radius * radius;
     }

    public void displayData () {
        System.out.println("Hình tròn có các thuộc tính là: Bán kính = " + this.radius + ", màu sắc = " + this.color );
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc: ");
        this.color = scanner.nextLine();
    }
}
