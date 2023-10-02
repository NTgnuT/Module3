import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Menu ==");
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số ");
        System.out.println("2. Kiểm tra số nguyên tố ");
        System.out.println("3. Kiểm tra số có chia hết cho 3 hay không");
        System.out.println("4. Thoát chương trình");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Nhập vào 1 số để kiểm tra");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("Số "+ number +" là số chẵn");
                } else {
                    System.out.println("Số "+ number +" là số lẻ");
                }
                break;
            case 2:
                System.out.println("Nhập vào 1 số để kiểm tra");
                int number2 = scanner.nextInt();
                if (number2 < 1) {
                    System.out.println("Số " + number2 + " không phải là số nguyên tố");
                    break;
                } else if (number2 == 2) {
                    System.out.println("Số 2 là số nguyên tố");
                } else {
                    for (int i = 2; i < number2; i++) {
                        if (number2 % i == 0) {
                            System.out.println("Số " + number2 + " không phải là số nguyên tố");
                            break;
                        } else {
                            System.out.println("Số " + number2 + " là số nguyên tố");
                            break;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Nhập vào 1 số để kiểm tra");
                int number3 = scanner.nextInt();
                if (number3 % 3 == 0) {
                    System.out.println("Số " + number3 + " chia hết cho 3");
                } else {
                    System.out.println("Số " + number3 + " không chia hết cho 3");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }



    }
}
