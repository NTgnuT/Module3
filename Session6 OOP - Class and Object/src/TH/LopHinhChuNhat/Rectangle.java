package TH.LopHinhChuNhat;

import java.util.Scanner;

public class Rectangle {

    private double width;

    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }

    public void displayData () {
        System.out.println("Hình chữ nhật có chiều dài: " + width + " và có chiều rộng: " + height);
        System.out.println("Chu vi hình chữ nhật: " + perimeter());
        System.out.println("Diện tích hình chữ nhật: " + area());
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        height = scanner.nextDouble();

    }





}
