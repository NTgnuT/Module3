package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimChuoiNganNhat {
    public static void main(String[] args) {

        // B1: tạo sẵn 1 string = 1 câu hoặc một đoạn văn
        String string = "là một collection không thể chứa ha giá trị trùng lặp";

        // B2: convert string đó thành list các string
        List<String> list = new ArrayList<>();
        list = Arrays.asList(string.split(" "));
        System.out.println(list);

        // B3: tạo thêm một List có kdl là String để lưu trữ những phần tử đc tìm thấy
        List<String> listMin = new ArrayList<>();

        String strMin = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < strMin.length()) {
                strMin = list.get(i);
            }
        }
        System.out.println(strMin);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == strMin.length()) {
                listMin.add(list.get(i));
            }
        }
        System.out.println(listMin);
    }
}
