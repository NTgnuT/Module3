import java.util.Scanner;

public class S3_TH2 {
    // Ứng dụng tính tiền lãi cho vay
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền cần vay: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Tỉ lệ lãi suất: ");
        double interest = Double.parseDouble(scanner.nextLine());
        System.out.println("Số tháng vay: ");
        int month = Integer.parseInt(scanner.nextLine());

        double total = 0;
        for(int i = 0; i <month; i++){
            total += money * interest/100/12 * month;
        }
        System.out.println("Tiền lãi của bạn là: "+total);
    }
}
