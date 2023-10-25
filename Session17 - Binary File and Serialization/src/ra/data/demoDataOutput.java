package ra.data;

import ra.data.modals.Student;

import java.io.*;

public class demoDataOutput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean status = true;
        double PI = 3.14;
        String language = "Java";

        File studentFile = new File("student.data");
//        studentFile.createNewFile();
//
        FileOutputStream fos = new FileOutputStream(studentFile);
//
//        DataOutputStream dos = new DataOutputStream(fos);
//        dos.writeUTF(language);
//        dos.writeDouble(PI);
//        dos.writeBoolean(status);
//        dos.close();

        System.out.println("Ghi vao file");
        Student student = new Student(1, "Tung", 25, true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
        System.out.println("Ghi thành công.");

        System.out.println("Thực hiện đọc từ file");
        FileInputStream fis = new FileInputStream(studentFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student1 = (Student) ois.readObject();
        System.out.println(student1);
        ois.close();
        System.out.println("Kết thúc đọc file");
    }
}
