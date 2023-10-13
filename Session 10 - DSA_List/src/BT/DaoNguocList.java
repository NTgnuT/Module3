package BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaoNguocList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(1);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();

        for (int i = list.size()-1; i >= 0 ; i--) {
            newList.add(list.get(i));
        }
        System.out.println(newList);

        Collections.reverse(list);
        System.out.println(list);


    }
}


