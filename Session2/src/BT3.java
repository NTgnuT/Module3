import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100 ; i++) {
            boolean check = true;
            for (int j = 2; j < i ; j++) {
                if (i % j ==0){
                    check = false;
                }
            }
            if (check) {
                System.out.println(i + " là số nguyên tố");
            }
        }

    }
}
