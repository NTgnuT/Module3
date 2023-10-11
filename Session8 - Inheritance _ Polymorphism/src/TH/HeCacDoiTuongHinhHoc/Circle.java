package TH.HeCacDoiTuongHinhHoc;

public class Circle extends Shape {
    private double raidius = 1.0;

    public Circle() {
    }

    public Circle(double raidius) {
        this.raidius = raidius;
    }

    public Circle(String color, boolean filled, double raidius) {
        super(color, filled);
        this.raidius = raidius;
    }

    public double getRaidius() {
        return raidius;
    }

    public void setRaidius(double raidius) {
        this.raidius = raidius;
    }

    public double getArea () {
        return Math.PI * raidius * raidius;
    }

    public double getPerimeter () {
        return 2 * raidius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + raidius + " , which is a subclass of " + super.toString();
    }
}
