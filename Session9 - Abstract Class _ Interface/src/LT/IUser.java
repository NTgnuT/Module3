package LT;

public interface IUser {
    int count = 0; // Khai báo thuộc tính mặc định là final

    String name = "Student";
     void login(String name);

     void display();

     static void noti () {
         System.out.println("Thông báo cho tất cả người dùng");
     }
}
