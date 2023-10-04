package TH;

public class TimGiaTriNhoNhat {
    // Tìm giá trị nhỏ nhất dùng phương thức
    public static void main(String[] args) {
        int[] arr = {0, 4, 8, 6, 2, -3};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);

    }

    public static int minValue(int[] array) {
        int index1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index1]) {
                index1 = i;
            }
        }
        return index1;
    }

}
