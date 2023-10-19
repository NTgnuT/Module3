package BT;

import java.util.Arrays;

public class baitap1 {
    private static int [] getArr () {
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] newArr = getArr();
        System.out.println(Arrays.toString(newArr));
        int max = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max) {
                max = newArr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
