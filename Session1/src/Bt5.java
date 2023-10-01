import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double physical = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double chemistry = scanner.nextDouble();
        System.out.println("Nhập điểm văn: ");
        double literature = scanner.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double english = scanner.nextDouble();

        double tb = (math + physical + chemistry + literature + english) / 5;

        if (0 <= tb && tb < 5) {
            System.out.println("Điểm TB=" + tb + " xếp loại yếu");
        } else if (5 <= tb && tb < 6.5) {
            System.out.println("Điểm TB=" + tb + " xếp loại trung bình");
        } else if (6.5 <= tb && tb < 8) {
            System.out.println("Điểm TB=" + tb + " xếp loại khá");
        } else if (8 <= tb && tb < 9) {
            System.out.println("Điểm TB=" + tb + " xếp loại giỏi");
        } else {
            System.out.println("Điểm TB=" + tb + " xếp loại xuất sắc");
        }
    }
}