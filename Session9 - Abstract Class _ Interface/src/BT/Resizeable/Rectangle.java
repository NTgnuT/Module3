package BT.Resizeable;

public class Rectangle extends Shape {
    private double width;

    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea () {
        return width * length;
    }

    public double getPerimeter () {
        return (width + length) * 2;
    }

    @Override
    public void Resize(double percent) {
        this.width *= 1 + percent / 100;
        this.length *= 1 + percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area =" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}
