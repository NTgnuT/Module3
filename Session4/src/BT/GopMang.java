package BT;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        // Gộp mảng.

        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử cho mảng 1:");
            arr1[i] = scanner.nextInt();
        }

        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử cho mảng 2:");
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for (int element: arr1) {
            arr3[k] = element;
            k++;
        }
        for (int element: arr2) {
            arr3[k] = element;
            k++;
        }
        System.out.println("Mảng mới sau khi gộp:" + Arrays.toString(arr3));
    }
}
