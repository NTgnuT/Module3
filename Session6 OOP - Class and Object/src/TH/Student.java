package TH;

public class Student {
    // Fields: các thuộc tính của class
    String name;
    int age;
    boolean gender;
    String phoneNumber;
    String address;

    // Contructors: phương thức khởi tạo

    public Student() {};

    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // set lại dữ liệu
    void setAddress(String address) {
        this.address = address;
    }

    // lấy dữ liệu
    String getName () {
        return this.name;
    }

    void displayInfo () {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    @Override // Đánh dấu hàm ghi đè
    public String toString() {
        return "Tên: " + this.name + ", tuổi: " + this.age + ", giới tính: " + (this.gender ? "Nam" : " Nữ");
    }

}
