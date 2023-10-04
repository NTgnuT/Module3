package BT;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng của bạn: ");
        int size = scanner.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " :");
            arr[i] = scanner.nextInt();
        }
        
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Mảng của bạn vừa nhập vào là: " + Arrays.toString(arr));
        System.out.println("Phần tử nhỏ nhất trong mảng là" + min);
    }
}
