package BT;

import java.util.Map;
import java.util.TreeMap;

public class baitap3 {
    public static void main(String[] args) {
        int [] list = {2, 6, 5, 4, 8};
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < list.length; i++) {
            map.put(list[i],0 );
        }
        Map.Entry<Integer, Integer> entry = map.firstEntry();
        System.out.println("Giá trị phần tử nhỏ nhất trong map là: " + entry.getKey());

    }
}
