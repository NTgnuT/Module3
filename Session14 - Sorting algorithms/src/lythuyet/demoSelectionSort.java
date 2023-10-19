package lythuyet;

public class demoSelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 8, 6, 7, 2, 9};

        for (int i = 1; i < a.length; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[indexOfMax]) {
                    indexOfMax = j;
                }
            }

        }
    }
}
