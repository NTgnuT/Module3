import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("data.txt");
        dataFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(dataFile);
        fos.write('J');
        fos.close();
    }
}