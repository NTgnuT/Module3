import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==Menu==");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông");
        System.out.println("3. Hình tam giác cân");
        System.out.println("Nhập lựa chọn của bạn");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Nhập chiều dài");
                int width = scanner.nextInt();
                System.out.println("Nhập chiều cao");
                int height = scanner.nextInt();

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                System.out.println("== Chọn 1 hình tam giá vuông ==");
                System.out.println("1.Góc vuông trên trái");
                System.out.println("2.Góc vuông trên phải");
                System.out.println("3.Góc vuông dưới trái");
                System.out.println("4.Góc vuông dưới phải");
                System.out.println("Nhập lựa chọn của bạn!");
                int choiseTriangle = scanner.nextInt();
                switch (choiseTriangle) {
                    case 1:
                        for (int i = 5; i >= 1 ; i--) {
                            for (int j = 1; j < i ; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                        break;
                        
                    case 2:
                        for (int i = 5; i >= 1 ; i--) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= i; k++) {
                                System.out.print(" *");
                            }
                            System.out.println(" ");
                        }
                        break;


                    case 3:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                        break;
                        
                    case 4:
                        for (int i = 1; i <=5 ; i++) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= i; k++) {
                                System.out.print(" *");
                            }
                            System.out.println(" ");
                        }
                        break;
                }
                break;

            case 3:
                for (int i = 1; i <= 6 ; i++) {
                    for (int j = 0; j < 6 - i ; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * i - 1 ; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }

    }
}
