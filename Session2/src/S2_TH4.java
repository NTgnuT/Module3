import java.util.Scanner;

public class S2_TH4 {

    // Tính chỉ số cân nặng của cơ thể
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cân nặng của bạn(tính theo kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao của bạn(tính theo m): ");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight/Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " bình thường");
        } else if (bmi < 30) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " thừa cân");
        } else {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " béo phì");
        }
    }
}



