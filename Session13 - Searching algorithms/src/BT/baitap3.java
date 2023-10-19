package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class baitap3 {
    private static int [][] getArr () {
        int [][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean

        // B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
        int[][] newArr = getArr();
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }

        // B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // B4: tạo biến check dkl bolean, mặc định = false
        boolean check= false;

        System.out.println("Nhập số bạn muốn tìm kiếm trong mảng: ");
        int input = Integer.parseInt(scanner.nextLine());

        // B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều,
        // nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if (newArr[i][j] == input) {
                    check = true;
                    list1.add(i);
                    list2.add(j);
                }
            }
        }

        if (!check) {
            System.out.println("Số bạn cần tìm không có trong mảng!");
        }

        // B6: in ra các vị trí và trả vể biến check
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Số " + input + " bạn cần tìm nằm ở vị trí: " + list1.get(i) + "-" + list2.get(i));
        }
    }
}
