package TH;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int id;

    private static int newID = 1;

    private String name;

    private int age;

    private boolean status = true;

    public Student() {
        this.id = newID++;
    }

    public Student(int id, String name, int age, boolean status) {
        this.id = newID++;
        this.name = name;
        this.age = age;
        this.status = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        name = scanner.nextLine();

        System.out.println("Nhập tuổi sinh viên: ");
        age = Integer.parseInt(scanner.nextLine());
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

}
