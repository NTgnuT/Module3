package BT.ChucNangQuanLySV;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[100];
    static int currentIndex = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("----- Student Manager -----");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Thoát");
            System.out.println("------------------------");
            System.out.println("Hãy nhập lựa chọn của bạn (1-5)");

            int choise = Integer.parseInt(scanner.nextLine());
            handleSelect(choise);
        }
    }

    private static void handleSelect(int choise) {
        switch (choise) {
            case 1:
                displayAllStudent();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            default:
                System.exit(1);
        }
    }

    private static void deleteStudent() {
        System.out.println("Nhập id của học sinh cần xóa: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == idDelete) {
                for (int j = 0; j < currentIndex; j++) {
                    students[j] = students[j + 1];
                }
                currentIndex--;
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với ID vừa nhập");
    }

    private static void editStudent() {
        System.out.println("Nhập id của học sinh cần sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == idEdit) {
                System.out.println("Thông tin sinh viên bạn muốn sửa: ");
                students[i].displayData();
                students[i].inputData();
                System.out.println("Bạn đã sửa thành công thông tin sinh viên");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với ID vừa nhập");
    }

    private static void displayAllStudent() {
        System.out.println("Danh sách tất cả sinh viên: ");
        for (int i = 0; i < currentIndex; i++) {
            students[i].displayData();
        }
        System.out.println("--------------------");
    }

    private static void addStudent() {
        Student student = new Student();
        student.inputData();
        students[currentIndex++] = student;
    }
}
