package BT.Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter () {
        return Math.PI * getRadius() * 2;
    }

    public double area () {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void Resize(double percent) {
        this.radius *= 1 + percent / 100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Perimeter= " + perimeter() +
                "Area=" + area() +
                '}';
    }
}
