package BT.Colorable;

public class Square extends Shape{

    private double length;

    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea () {
        return length * width;
    }

    @Override
    public void howToColor() {
        System.out.println("Area = " + getArea());
        System.out.println("Color all four sides.");
    }
}
