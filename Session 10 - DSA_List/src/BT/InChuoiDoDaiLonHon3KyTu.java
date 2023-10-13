package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InChuoiDoDaiLonHon3KyTu {
    public static void main(String[] args) {
        String string = "Rikkei Academy để nông dân biết code";

        List<String> list = new ArrayList<String>();

        // B3: convert string ở bước 1 thành List string rồi gán vào Lits đc tạo ở b2.
        list = Arrays.asList(string.split(" "));
        System.out.println(list);

        // B4: duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 3) {
                System.out.println(list.get(i));
            }
        }
    }
}
