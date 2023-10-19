package lythuyet;

public class demoBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 6, 7, 2, 9};
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }
            }
        }
    }
}
