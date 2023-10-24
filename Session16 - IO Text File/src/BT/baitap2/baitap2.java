package BT.baitap2;

import java.io.*;

public class baitap2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/BT/baitap2/info.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("dòng 1");
        bufferedWriter.newLine();
        bufferedWriter.write("dòng 2");
        bufferedWriter.newLine();
        bufferedWriter.write("dòng 3");
        bufferedWriter.close();

        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int count = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
            count++;
        }
        System.out.println("Số dòng của file cần đếm là: " + count);
    }
}
