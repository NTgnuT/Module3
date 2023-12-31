package BT.baitap1;

import java.io.*;

public class baitap1 {
    public static void main(String[] args) throws IOException {
        // B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)
        File file = new File("src/BT/baitap1/string.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("tạo file text có sẵn dữ liệu văn bản");
        writer.close();

        //B2: Tạo hàm đọc file trên và trả ra String.
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String string = bufferedReader.readLine();

        //B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
        String [] strArr = string.split(" ");
        //B4: length của mảng trên chính là số lượng từ trong file.
        System.out.println("Số lượng từ trong file là: " + strArr.length);
    }
}
