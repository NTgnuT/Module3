package LT.run;

import LT.modal.Employee;
import LT.modal.Skill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Java", 2));
        skills.add(new Skill("PHP", 1));

        Employee employee = new Employee(1, "Tung", true, skills);


        File file = new File("src/LT/modal/employee.dat");
        file.createNewFile();

        System.out.println("Ghi dữ liệu vào file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        System.out.println("Ghi dữ liệu vào file thành công");

        System.out.println("Đọc dữ liệu từ file");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee1 = (Employee) objectInputStream.readObject();
        System.out.println(employee1);
        objectInputStream.close();

    }
}
