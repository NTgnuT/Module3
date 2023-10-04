package TH;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int [] array = {4, 9, 10, 6, 3, 5, 7, 2};

        // Duyệt qua các phần tử của mảng để tìm giá trị lớn nhất
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max + ", nằm ở vị trí " + index);
    }
}
