package BT.LopCircleVaLopCylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double CylinderVolume () {
        return (Math.PI * getRadius() * getRadius() * height);
    }

    public void displayData () {
        super.displayData();
        System.out.println("Đường cao của hình trụ: " + height);
        System.out.println("Thể tích của hình trụ: " + CylinderVolume());
    }

}
