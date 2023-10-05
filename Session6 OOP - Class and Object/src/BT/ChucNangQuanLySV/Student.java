package BT.ChucNangQuanLySV;

import java.util.Scanner;

public class Student {
    private int studentId;

    private String studentName;

    private int age;

    private boolean gender;

    private String address;

    private String phoneNumber;

    private static int count = 1;

    public Student() {
        this.studentId = Student.count++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập thông tin sinh viên");
        System.out.println("Nhập tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính sinh viên");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ sinh viên");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại sinh viên");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println(
                "Student{" +
                        "studentId=" + studentId +
                        ", studentName='" + studentName + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}'
        );
    }


}
