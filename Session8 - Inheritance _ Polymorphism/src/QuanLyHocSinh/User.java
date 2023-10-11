package QuanLyHocSinh;

import java.util.Scanner;

public class User {
    private int id;

    private static int newId = 1;

    private String name;

    private String password;

    public User() {
        this.id = User.newId++;
    }

    public User(String name, String password) {
        this.id = User.newId++;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        if (username.equals(getName()) && password.equals(getPassword())) {
            System.out.println("login thành công");
            displayData();
        } else {
            System.out.println("username hoặc password của bạn không đúng");
        }
    }

    public void displayData() {
        System.out.println("ID: " + getId());
        System.out.println("Username: " + getName());
        System.out.println("Password: " + getPassword());
    }
}
