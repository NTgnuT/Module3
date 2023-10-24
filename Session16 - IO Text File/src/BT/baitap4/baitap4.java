package BT.baitap4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class baitap4 {
    public static void main(String[] args) throws IOException {
        //Viết chương trình đọc nội dung từ file text và sắp xếp các từ trong file theo thứ tự bảng chữ cái.
        File file = new File("src/BT/baitap4/fileInfo.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("b f d a e c h g");
        writer.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();

        String [] strArr = string.split(" ");

        // Cách 1: dùng Colection.sort()
//        List<String> list = Arrays.asList(strArr);
//        Collections.sort(list);
//        System.out.println("Mảng sau khi sắp xếp là: " + list);

        // Cách 2: dùng Array.sort()
        Arrays.sort(strArr, (arr1, arr2) -> arr1.compareTo(arr2));
        System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(strArr));
    }
}
