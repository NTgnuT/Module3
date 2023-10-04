package TH;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        double F;
        double C;


        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập hành động bạn muốn:");
            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    F = scanner.nextDouble();
                    C = (5.0/9) * (F-32);
                    System.out.println("Độ C của bạn là: " + C );
                    break;

                case 2:
                    System.out.println("Nhập độ C: ");
                    C = scanner.nextDouble();
                    F = (9.0/5) * C + 32;
                    System.out.println("Độ F của bạn là: " + F );
                    break;

                case 0:
                    System.exit(0);
            }
        } while (choise != 0);


    }
}
