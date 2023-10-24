import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) throws IOException {
        File data = new File("data");
        if (data.mkdir()) {
            System.out.println("Tao folder thanh cong ");
            return;
        }
        System.out.println("Tao folder that bai");

        File input = new File("data/input.txt");
        input.createNewFile();

        File demo = new File("data/Demo.java");
        demo.createNewFile();

        File sub1 = new File("data/sub1");
        sub1.mkdir();

            File output = new File ("data/sub1/output.txt");
            output.createNewFile();

            File student = new File ("data/sub1/student.data");
            student.createNewFile();

        File sub2 = new File("data/sub2");
        sub2.mkdir();

        File [] fileArr = data.listFiles();
        System.out.println("Cay thu muc " + data.getName() + " co cac tep va thu muc con sau: ");
        for (File file : fileArr) {
            System.out.println("-" +file.getName());
            if (file.isDirectory()) {
                File [] fileIn = file.listFiles();
                for (File file2: fileIn) {
                    System.out.println("--" + file2.getName());
                }
            }
        }
    }
}
