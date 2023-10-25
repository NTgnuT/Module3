package ra.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demoReadData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("student.data");
        DataInputStream dis = new DataInputStream(fis);

        String language = dis.readUTF();
        double PI = dis.readDouble();
        boolean status = dis.readBoolean();

        System.out.println(language);
        System.out.println(PI);
        System.out.println(status);
    }
}
