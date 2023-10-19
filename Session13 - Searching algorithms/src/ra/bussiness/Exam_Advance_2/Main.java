package ra.bussiness.Exam_Advance_2;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Stack<String> stack = new Stack<>();

    static String input;

    public static void main(String[] args) {


        while (true) {
            System.out.println("----------MENU-----------");
            System.out.println("1. Nhập câu.");
            System.out.println("2. Đảo ngược câu.");
            System.out.println("3. Thoát.");
            System.out.println("----------------------");
            System.out.println("Nhập lựa chọn của bạn");
            int choise = Integer.parseInt(scanner.nextLine());
            handleChoise(choise);
        }

    }

    private static void handleChoise(int choise) {
        switch (choise) {
            case 1:
                System.out.println("Nhập câu bạn muốn đảo ngược");
                input = scanner.nextLine();
                break;
            case 2:
                List<String> list = new ArrayList<>();
                list = Arrays.asList(input.trim().split(" "));
                for (int i = 0; i < list.size(); i++) {
                    stack.add(0,list.get(i));
                }
                for (String e: stack ) {
                    System.out.print(e + " ");
                }
                System.out.println();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }
    }
}
