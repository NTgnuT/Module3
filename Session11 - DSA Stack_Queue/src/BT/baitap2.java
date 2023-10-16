package BT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class baitap2 {



    // kiểm tra xem một chuỗi đầu vào có dấu ngoặc đúng hay không
    public static void main(String[] args) {
       //B1 : Tạo một stack rỗng để lưu trữ các dấu ngoặc.
        Stack<Character> stack = new Stack<>();

        //B2: Duyệt từng ký tự trong chuỗi đầu vào.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn muốn kiểm tra.");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char pt = input.charAt(i);

            //B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
            if (pt == '(' || pt == '{' || pt == '[') {
                stack.add(pt);

                //B4: Nếu ký tự đang xét là một dấu ngoặc đóng (như ), }, ]),
            } else if (pt == ')' || pt == '}' || pt == ']') {
                // lấy phần tử trên cùng của stack ra và so sánh với dấu ngoặc đóng.
                // Nếu chúng không khớp, chuỗi không đúng. Nếu khớp, tiếp tục xét ký tự tiếp theo.
                if (stack.isEmpty()) {
                    System.out.println("Không có cặp ngoặc");
                    return;
                }

                if (!checkBracket(stack.pop(), pt)) {
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
            }
        }

        //B5: Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng.
        boolean check = stack.isEmpty();
        if (check){
            System.out.println("có các cặp ngoặc hợp lệ");
        }else System.out.println("không có cặp ngoặc");

    }

    // Hàm kiểm tra cặp ngoặc trùng khớp
    private static boolean checkBracket (char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
