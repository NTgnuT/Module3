import java.util.Scanner;
public class S2_TH1 {

    // Giải phương trình bậc nhất
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a!=0) { // trường hợp a khác 0
            double x = (c - b) / a;
            System.out.println("Giá trị của x là: " + x);
        } else { // trường hợp a bằng 0
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }


}
