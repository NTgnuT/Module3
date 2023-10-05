package TH.ThucHienPhepTinh2So;

import java.util.Scanner;

public class Calculator {
    private double a;

    private double b;

    public Calculator () {}

    public Calculator (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add () {
        return a + b;
    }

    public double sub () {
        return a - b;
    }

    public double multi () {
        return a * b;
    }

    public double div () {
        return a / b;
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        this.a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        this.b = scanner.nextDouble();
    }

    public void  displayData () {
        System.out.println("Tổng của 2 số là: " + add());
        System.out.println("Hiệu của 2 số là: " + sub());
        System.out.println("Tích của 2 số là: " + multi());
        System.out.println("Thương của 2 số là: " + div());
    }




}
