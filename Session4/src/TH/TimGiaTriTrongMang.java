package TH;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        // Khai báo mảng chưa danh sách sinh viên
        String [] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        // Khai báo biến để lưu tên tìm kiếm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String input_name = scanner.nextLine();

        // Duyệt mảng đã khai báo, tìm phần tử có giá trị bằng giá trị nhập vào
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) { // so sánh 2 chuỗi dựa trên nội dung
                System.out.println("Học sinh " + input_name + " nằm ở vị trí: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tên học sinh " + input_name + " trong danh sách");
        }
    }
}
