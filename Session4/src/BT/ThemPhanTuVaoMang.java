package BT;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        // Thêm phần tử vào mảng.
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng hiện tại có gồm: " + Arrays.toString(arr));

        System.out.println("Nhập số muốn chèn: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn: ");
        int index = scanner.nextInt();

        int i = 0;

            if (index <= -1 || index > arr.length - 1) {
                System.out.println("Không chèn được phần tử vào mảng");
            } else {
                int [] newArr = new int[arr.length + 1];
                for (int j = 0; j <= index ; j++) {
                    if (j < index) {
                        newArr[i] = arr[j];
                        i++;
                    } else {
                        newArr[j] = x;
                        i++;
                    }
                }
                for (int j = index; j < arr.length ; j++) {
                    newArr[i] = arr[j];
                    i++;
                }
                System.out.println(Arrays.toString(newArr));
            }
    }
}
