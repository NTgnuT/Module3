package BT.baitap5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baitap5 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/BT/baitap5/file.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("nếu lớn hơn length lớn nhất thì đổi list thànhh list mới và gán lại");
        writer.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        // B1: đọc file thành String.
        String string = reader.readLine();

        //B2: convert thành mảng string với mỗi từ là 1 phần tử.
        String [] strArr = string.split(" ");
        System.out.println(Arrays.toString(strArr));

        //B3: tạo 1 list string để lưu các từ tìm được.
        List<String> list = new ArrayList<>();

        //B4: duyệt mảng tìm length lớn nhất, nếu leng của phần tử = leng lớn nhất thì add vào list,
        // nếu lớn hơn length lớn nhất thì đổi list list mới và gán lại.
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() == max) {
                list.add(strArr[i]);
            }
        }
        //B5: tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Từ có độ dài lớn nhất là: " + list.get(i) + ", có độ dài: " + max);
        }
    }
}
