package ra.view;

import ra.Config.Config;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("**********************SCHOOL-MANAGEMENT************************");
            System.out.println("1. Quản lý lớp học");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("3. Quản lý môn học");
            System.out.println("4. Quản lý điểm");
            System.out.println("0. Thoát");
            System.out.println("Mời lựa chọn: ");
            choice = Config.validateInt();
            switch (choice) {
                case 1:
                    new ClassroomView().menu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này !");
                    break;
            }
        } while (true);
    }
}
