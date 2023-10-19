package lythuyet;

public class demoInsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 8, 6, 7, 2, 9};
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (a[j] < a[j-1]) {
                    ArrayUtil.swap(a,j,j-1);
                }
            }
        }
    }
}
