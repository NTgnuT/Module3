package BT;

import java.util.*;

public class baitap1 {
    public static void main(String[] args) {
        int[] arr = {2,4,8,6,3,5,2,3,5,2,2,4};
        Map<Integer, Integer> check = new HashMap<>();

        // Cách 1:
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            if(check.containsKey(arr[i])) {
//                continue;
//            }
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            check.put(arr[i],count );
//        }

        // Cách 2:
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (check.containsKey(arr[i])) {
                // Nếu đã có thì tăng count
                count = check.get(arr[i]);
                check.put(arr[i], count + 1 );
            } else {
                // Chưa có thì thêm mới
                check.put(arr[i], 1);
            }
        }

//        Set<Integer> checkList = check.keySet();
        int maxKey = 0;
        int maxValue = 0;
        for (Integer list: check.keySet()) {
            System.out.println("Phần tử " + list + " xuất hiện " + check.get(list));
            if (maxKey < check.get(list)) {
                maxKey = check.get(list);
                maxValue = list;
            }
        }
        System.out.println("Phần tử " + maxValue + " có số lần xuất hiện nhiều nhất là " + maxKey);
    }
}
