package BT;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class baitap2 {
    public static void main(String[] args) {
        //  - B1: Khai báo và khởi tạo một mảng các số nguyên.
        int [] arr = {1,5,6,7,2,8,9,4};

        //  - B2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng.
        //  Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        //   - B3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap.
        //   Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], 0);
        }

        //   - B4: Lấy giá trị của phần tử lớn nhất trong TreeMap
        //   System.out.println(treeMap.lastKey());
        int maxKey = treeMap.lastKey();

//           - B5: Xóa phần tử lớn nhất khỏi TreeMap.
        treeMap.remove(maxKey);

//        -	B6: Lúc này phần tử lớn nhất trong treemap sẽ là phần tử lớn thứ 2 trong mảng ban đầu,
//        ta dung phương thức lastKey() để lấy nó ra.
        System.out.println("Phần tử lớn thứ 2 trong mảng là: " + treeMap.lastKey());
    }
}
