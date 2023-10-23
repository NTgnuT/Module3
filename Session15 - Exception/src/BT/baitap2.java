package BT;

import java.util.EmptyStackException;

public class baitap2 {
    public static void main(String[] args) {
        int [] a = {};

        try {
            checkArray(a);
        } catch (EmptyArrayException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void checkArray (int [] a) throws EmptyArrayException {
        if (a.length != 0) {
            int max = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println("Số lớn nhất trong mảng là: " + max);
        } else {
            throw new EmptyArrayException("Mảng của bạn đang rỗng");
        }
    }

    public static class EmptyArrayException extends Exception {
        public EmptyArrayException(String message) {
            super(message);
        }
    }

}
