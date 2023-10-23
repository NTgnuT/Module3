package ra.Config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static int validateInt () {
        int n = -1 ;
        System.out.println("Mời nhập: ");
        while (true) {
            try {
                n = Integer.parseInt(scanner().nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Sai định dạng, mời nhập lại");
                validateInt();
            }
            return n;
        }
    }
}
