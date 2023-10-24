import java.io.File;
import java.io.IOException;

public class demoFile {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("src/data.txt");
        if (dataFile.createNewFile()) {
            System.out.println("Tao file thanh cong");
            return;
        }
        System.out.println("Tao file khong thanh cong");

        File inputDir = new File("input");
        if (inputDir.mkdir()) {
            System.out.println("Tao folder input thanh cong");
            return;
        }
        System.out.println("Tao folder that bai");

        File subFolder = new File("src/sub");
        if (subFolder.mkdir()) {
            File inputFile = new File("src/sub/input.txt");
            inputFile.createNewFile();
        }

        File srcDir = new File("src");
        File [] subArray = srcDir.listFiles();
        System.out.println("Folder " + srcDir.getName() + " co cac tep va thu muc con sau: ");
        for (File file : subArray) {
            System.out.println(file.getName());
        }


    }
}