package BT;

import java.util.Arrays;

public class baitap1 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));

        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);

    }

    private static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 0; i < arr.length - 1; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos-1]){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        System.out.println("Mang sap xep theo Insertion Sort: " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mang sap xep theo Selection Sort: " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp theo Bubble Sort: " + Arrays.toString(arr));
    }
}
