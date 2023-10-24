package BT.baitap3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baitap3 {
    public static void main(String[] args) throws IOException {
        //B1: tạo file và cho sẵn dữ liệu(có thêt coppy đề bài cho vào file)
        File file = new File("src/BT/baitap3/text.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("kiểm tra từ từ trùng trùng lặp");
        writer.close();

        //B2: viết hàm đọc file.
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String strFile = reader.readLine();

        //B3: convert file đọc được thành mảng string với mỗi từ là 1 phần tử
        String [] string = strFile.split(" ");
        System.out.println(Arrays.toString(string));

        //B4: sử dụng vòng lặp để tìm kiếm các phần tử xuất hiện nhiều hơn 1 lần và add những phần tử đó vào 1 list
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length - 1; i++) {
            for (int j = i + 1; j < string.length ; j++) {
                if (string[i].equals(string[j])) {
                    list.add(string[i]);
                }
            }
        }
        System.out.println("Các từ trùng lặp trong file là: " + list);
        //B5: hiển thị kết quả.


    }
}
