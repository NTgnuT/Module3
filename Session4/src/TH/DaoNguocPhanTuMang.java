package TH;

import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        // B1: khai báo biến, nhập và kiểm tra kích thước của mảng
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài của mảng không được lớn hơn 20.");
            }
        } while (size > 20);
        array = new int[size];

        // B2: Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử cho mảng " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        // B3: in ra mảng đã nhập
        System.out.print("Các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        // B4: đảo ngược các phần tử trong mảng, sử dụng biến trung gian
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // B5: in ra mảng khi đã đảo ngược các thứ tự của phần tử
        System.out.println("Mảng mới: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
    }
}
