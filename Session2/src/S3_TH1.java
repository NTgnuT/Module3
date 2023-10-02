import java.util.Scanner;

public class S3_TH1 {
    // Kiểm tra số nguyên tố
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số để kiểm tra số nguyên tố");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else if (number == 2) {
            System.out.println(number + "  là số nguyên tố");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + " không phải số nguyên tố");
                    break;
                } else {
                    System.out.println(number + " là số nguyên tố");
                    break;
                }
            }
        }

    }
}
