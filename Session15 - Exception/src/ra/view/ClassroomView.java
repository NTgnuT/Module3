package ra.view;

import ra.Config.Config;
import ra.modal.Classroom;
import ra.modal.Student;
import ra.service.IClassroomService;
import ra.service.IStudentService;
import ra.service.Impl.ClassroomImpl;
import ra.service.Impl.StudentImpl;

import java.util.ArrayList;
import java.util.List;

public class ClassroomView {
    IClassroomService classroomService = new ClassroomImpl();
    IStudentService studentService = new StudentImpl();
    public void menu() {
        int choice;
        do {
            System.out.println("**********************CLASSROOM-MANAGEMENT************************");
            System.out.println("1. Hiển thị danh sách lớp học");
            System.out.println("2. Thêm lớp học mới");
            System.out.println("3. Sửa thông tin lớp học");
            System.out.println("4. Xóa lớp học");
            System.out.println("0. Thoát");
            System.out.println("Mời lựa chọn: ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    showAllClass();
                    break;
                case 2:
                    addClassroom();
                    break;
                case 3:
                    editClassroom();
                    break;
                case 4:
                    deleteClassroom();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này !");
                    break;
            }
        }
        while (true);
    }

    private void deleteClassroom() {
        System.out.println("Nhập id lớp học cần xóa");
        int idDelete = Config.validateInt();
        List<Student> studentList = studentService.findAll();

        for (Student student : studentList) {
            if (student.getClassroom().getClassroomId() == idDelete){
                System.out.println("Lớp học đã tồn tại sinh viên, không được xóa!!!");
                return;
            }
        }

        boolean check = false;
        for (Classroom classroom : classroomService.findAll()) {
            if (classroom.getClassroomId() == idDelete) {
                classroomService.deleteById(idDelete);
                System.out.println("Xóa lớp học thành công");
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Không tìm thấy lớp học theo id vừa nhập!!!");
        }
    }

    private void editClassroom() {
        System.out.println("Nhập lớp học cần sửa thông tin.");
        int idEdit = Config.validateInt();
        Classroom classroomEdit = classroomService.findById(idEdit);
        if (classroomEdit == null) {
            System.out.println("Không tìm thấy lớp theo id vừa nhập.");
        } else {
            System.out.println(classroomEdit);
            int choice;
            System.out.println("Mời chọn thông tin cần sửa.");
            System.out.println("1. Sửa tên");
            System.out.println("2. Sửa trạng thái");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên mới: ");
                    classroomEdit.setClassroomName(Config.scanner().nextLine());
                    break;
                case 2:
                    classroomEdit.setStatus(!classroomEdit.isStatus());
                    break;
                default:
                    System.out.println("Không có lựa chọn mời nhập lại");
            }
            classroomService.update(classroomEdit);
        }
    }

    private void addClassroom() {
        System.out.println("Nhập số lượng lớp học cần thêm.");
        int n = Config.validateInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho lớp thứ: " + (i+1));
            Classroom newClassroom = new Classroom();
            System.out.println("Nhập tên lớp: ");
            newClassroom.setClassroomName(Config.scanner().nextLine());
            System.out.println("Nhập trạng thái lớp (true/false): ");
            newClassroom.setStatus(Boolean.parseBoolean(Config.scanner().nextLine()));
            classroomService.save(newClassroom);
        }
    }

    private void showAllClass() {
        System.out.println("DANH SÁCH CÁC LỚP HỌC.");
        List<Classroom> classroomList = classroomService.findAll();
        for (Classroom classroom : classroomList ) {
            System.out.println(classroom);
        }
    }
}