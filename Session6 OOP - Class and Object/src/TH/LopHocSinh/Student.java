package TH.LopHocSinh;

import java.util.Scanner;

public class Student {
    private int studentId;

    private String studentName;

    private boolean gender;

    private String className;

    private int age;

    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean gender, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void displayData() {
        System.out.println(
                "Student{" +
                        "studentId=" + studentId +
                        ", studentName='" + studentName + '\'' +
                        ", gender=" + (gender ? "Nam" : "Nữ") +
                        ", className='" + className + '\'' +
                        ", age=" + age +
                        ", address='" + address + '\'' +
                        '}'
        );
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean isGender() {
        return gender;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        studentName = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập tên lớp: ");
        className = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }



}
