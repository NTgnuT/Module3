package TH.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ các lớp con
        Car car1 = new Car("Toyota", "grey");
        Car car2 = new Car("Huyndai", "red");

        // Truy cập các phương thức của lớp cha get/set
        System.out.println("car1 có thương hiệu là: " + car1.getBrand());
        car1.setColor("white"); // thiết lập lại màu cho car1

        // Hiển thị thông tin của oto
        System.out.println("Car1: " + car1.toString());
        System.out.println("Car2: " + car2.toString());

        // Khởi tạo đối tượng xe moto
        Motorcycle motor1 = new Motorcycle("Honda", "black-white");
        Motorcycle motor2 = new Motorcycle("Vinfast", "blue");

        // Hiển thị thông tin xe máy
        System.out.println("Motor1: " + motor1.toString());
        System.out.println("Motor2: " + motor2.toString());

    }
}
