import LT.Animal;
import LT.Dog;
import LT.IUser;
import LT.impl.UserIlpm;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();

        Animal doggo = new Dog();

        IUser user = new UserIlpm();
        user.login("Student");


    }
}