package BT;

import java.util.Arrays;

public class baitap3 {
    public static void main(String[] args) {
        String [] arr = {"banana", "apple", "orange", "grape", "pear"};

//        bullbleSort(arr);
//        System.out.println(Arrays.toString(arr));

//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
    public static void bullbleSort(String [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort (String [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            String min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (min.compareTo(arr[j]) > 0) {
                    min = arr[j];
                    index = j;
                }
            }

            if (index != i) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void insertionSort (String [] arr) {
        for (int i = 1; i < arr.length; i++) {
            String str = arr[i];
            int j;
            for ( j = i - 1; j >= 0 && arr[j].compareTo(str) > 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = str;
        }
    }

}
