package BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXepGiamDan {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int random = (int) Math.round(Math.random() * 99 + 1);
            list.add(random);
        }
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
