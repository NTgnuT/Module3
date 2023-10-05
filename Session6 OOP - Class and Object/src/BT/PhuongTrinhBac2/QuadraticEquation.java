package BT.PhuongTrinhBac2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation () {

    }

    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b*b) - (4*a*c);
    }

    public double getRoot1 () {
        return (-b + Math.sqrt(b*b - (4*a*c))) / (2*a) ;
    }

    public double getRoot2 () {
        return (-b - Math.sqrt(b*b - (4*a*c))) / (2*a) ;
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập giá trị của c: ");
        c = scanner.nextDouble();
    }

    public void displayData () {
        double delta = getDiscriminant();
        double x = -b / 2*a;

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + getRoot1() + " và " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
