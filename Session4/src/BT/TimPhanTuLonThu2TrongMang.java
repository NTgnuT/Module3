package BT;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonThu2TrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cho mảng số nguyên");
        int size = scanner.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị số nguyên thứ " +(i+1)+ " cho mảng:");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (max2 < arr[i] && arr[i] != max) {
                max2 = arr[i];
            }
        }
        System.out.println("Phần tử lớn thứ 2 trong chuỗi là: " + max2);
        System.out.println(max);

    }
}
