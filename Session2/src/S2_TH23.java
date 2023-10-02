import java.util.Scanner;
public class S2_TH23 {
// Tính số ngày trong tháng và kiểm tra năm nhuận

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn kiểm tra ngày: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập năm: ");
        int year = Integer.parseInt(scanner.nextLine());

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month+ ", năm " + year +  " có 31 ngày ");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month+ ", năm " + year +  " có 30 ngày ");
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0) ) {
                    System.out.println("Tháng 2 năm " + year + " có 29 ngày");
                } else {
                    System.out.println("Tháng 2 năm " + year + " có 28 ngày ");
                }
        }

    }
}




