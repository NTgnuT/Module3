package TH.Animal;

public class Main {
    public static void main(String[] args) {

        //Tạo các đối tượng từ các lớp
        Animal animal = new Animal("Pig");
        Dog dog1 = new Dog("Poodle", "Brown");
        Dog dog2 = new Dog("Bun", "Black");
        Cat cat1 = new Cat("Mun");

        // Dùng các phương thức get/set truy cập và thay đổi thuộc tính
        System.out.println("Animal có tên là: " + animal.getName());
        animal.setName("Becgie");
        System.out.println("Animal có tên là: " + animal.getName());

        // Truy cập phương thức được kế thừa ở lớp cha.
        dog1.setName("Corgi");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Sound: " + dog1.makeSound());
        System.out.println("Color: " + dog2.getColor());
        System.out.println("Sound: " + dog2.makeSound());
        System.out.println("Name: " + cat1.getName());
        System.out.println("Sound: " + cat1.makeSound());
    }
}
