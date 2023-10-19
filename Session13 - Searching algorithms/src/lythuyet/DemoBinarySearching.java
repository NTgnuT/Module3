package lythuyet;

import java.util.Scanner;

public class DemoBinarySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 6, 8, 12, 16, 18, 20};

        while (true) {
            System.out.println("Nhập vào giá trị cần tìm kiếm ");
            int searchNumber = Integer.parseInt(scanner.nextLine());
            int mid;
            int low = 0;
            int high = arr.length - 1;
            boolean check = false;
            while (low <= high) {
                mid = (high + low) / 2;
                if (arr[mid] == searchNumber) {
                    System.out.printf("Phần tử %d nằm ở vị trí %d", searchNumber, mid);
                    check = true;
                    break;
                } else if (arr[mid] < searchNumber) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }


            if (!check) {
                System.out.println("Số bạn cần tim không có trong mảng");
            }
        }
    }
}

