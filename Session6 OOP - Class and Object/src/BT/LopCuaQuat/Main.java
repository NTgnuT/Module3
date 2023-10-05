package BT.LopCuaQuat;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.displayData();


        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("red");
        fan1.displayData();
    }
}
