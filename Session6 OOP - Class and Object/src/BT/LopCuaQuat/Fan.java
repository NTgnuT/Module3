package BT.LopCuaQuat;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;

    private boolean on;

    private double radius;

    private String color;


    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void displayData() {

        if (isOn()) {
            System.out.println(
                    "Fan{" +
                            "speed=" + speed +
                            ", fan is on"  +
                            ", radius=" + radius +
                            ", color='" + color + '\'' +
                            '}'
            );
        } else {
            System.out.println(
                    "Fan{" +
                            ", fan is off"  +
                            ", radius=" + radius +
                            ", color='" + color + '\'' +
                            '}'
            );
        }

    }
}
