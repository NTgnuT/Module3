package BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HamTrongList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 99 + 1);
            number.add(random);
        }

        System.out.println(number);
        Integer max = Collections.max(number);
        System.out.println(max);
    }
}
