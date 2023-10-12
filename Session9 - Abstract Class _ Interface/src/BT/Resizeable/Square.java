package BT.Resizeable;

public class Square extends  Shape{
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea () {
        return length * length;
    }

    public double getPerimeter () {
        return length * 4;
    }

    @Override
    public void Resize(double percent) {
        this.length *= 1 + percent / 100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", area=" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}
