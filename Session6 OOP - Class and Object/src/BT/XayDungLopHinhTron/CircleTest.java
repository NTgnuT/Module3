package BT.XayDungLopHinhTron;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Chu vi "+ circle.perimeter());
        System.out.println("Diện tích "+ circle.area());
    }
}
