package BT.LopCircleVaLopCylinder;

public class Circle {
    private double radius;

    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area () {
        return (Math.PI * radius * radius);
    }

    public void displayData() {
        System.out.println("Bán kính của hình tròn là: " + radius);
        System.out.println("Màu của hình tròn là: " + color);
        System.out.println("Diện tích của hình tròn là: " + area());
    }
}
