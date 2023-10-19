package BT;

import java.util.Arrays;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử cho mảng của bạn");
        int inputArr = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[inputArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng bạn vừa nhập:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập số bạn cần tìm trong mảng:");
        int find = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                check = true;
                System.out.println("Phần tử bạn cần tìm nằm ở vị trí thứ: " + (i+1));
                break;
            }
        }
        if (!check) {
            System.out.println("Trong mảng không có đối tượng bạn cần tìm!");
        }
    }
}
