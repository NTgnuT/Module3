package LT.impl;

import LT.IUser;

public class UserIlpm implements IUser {

    @Override
    public void login(String name) {
        if (this.name.equals(name)) {
            System.out.println("Đăng nhập thành công");
            this.display();
        } else {
            System.out.println("Đăng nhập thất bại");
        }
    }

    @Override
    public void display() {
        System.out.println("Hiển thị với người dùng là: " + name);
    }
}
