package TH.Animal;

public class Animal {
    private String name;

    public Animal () {}

    public Animal(String name) { // tạo thuộc tính để lớp con kế thừa
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound () { // tạo phương thức cho lớp con để ghi đè
        return "";
    }  // Hành vi phải tạo phương thức

}
