import java.util.Scanner;

public class BT1 {
    // Tính tổng các số chẵn trong khoảng cho trước
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu của chuỗi: ");
        int start = scanner.nextInt();
        System.out.println("Nhập số kết thúc của chuỗi ");
        int end = scanner.nextInt();

        int total = 0;

        if (start > end) {
            System.out.println("Số bắt đầu phải nhỏ hơn số kết thúc");
        } else {
            for (int i = start; i<= end; i++) {
                if (i % 2 == 0) {
                    total += i;
                }
            }
        }
        System.out.println("Tổng của các số chẵn trong dãy là:" + total);

    }
}
