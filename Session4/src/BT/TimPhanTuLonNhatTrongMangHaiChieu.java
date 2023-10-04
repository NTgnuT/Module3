package BT;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng trong mảng 2 chiều:");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột trong mảng 2 chiều: ");
        int column = scanner.nextInt();

        int [][] arr = new int[row][column];
        int max = 0;
        int cowMax = 0;
        int columnMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                System.out.println("Nhập phần tử thứ " + j + " dòng " + i + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    cowMax = i;
                    columnMax = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mảng của bạn là: " + Arrays.toString(arr[i]));
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Giá trị lớn nhất trong mảng nằm ở dòng: " + cowMax + " cột:" + columnMax);

    }
}
