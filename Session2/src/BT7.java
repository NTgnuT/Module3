import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Menu ==");
        System.out.println("1. Tính chu vi và diện tích của hình chữ nhật ");
        System.out.println("2. Tính chu vi và diện tích của hình tam giác ");
        System.out.println("3. Tính chu vi và diện tích của hình tròn ");
        System.out.println("4. Thoát chương trình");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Nhập chiều dài:");
                double width = scanner.nextDouble();
                System.out.println("Nhập chiều rộng");
                double height = scanner.nextDouble();

                double perimeterRectangle = (width + height) * 2;
                double areaRectangle = width * height;
                System.out.println("Chu vi hình chữ nhật: " + perimeterRectangle);
                System.out.println("Diện tích hình chữ nhật: " + areaRectangle);

                break;
            case 2:
                System.out.println("Nhập chiều dài cạnh a:");
                double a = scanner.nextDouble();
                System.out.println("Nhập chiều dài cạnh b:");
                double b = scanner.nextDouble();
                System.out.println("Nhập chiều dài cạnh c:");
                double c = scanner.nextDouble();

                if (a + b > c && b+c>a && c+a>b) {
                    double perimeter = a + b + c;
                    double area = Math.sqrt(perimeter/2 * (perimeter/2 - a) * (perimeter/2 - b) * (perimeter/2 - c));
                    System.out.println("Chu vi hinh tam giac la: "+perimeter);
                    System.out.println("Dien tich hinh tam giac la: "+area);
                }
                break;

            case 3:
                final double PI=3.14;
                System.out.println("Nhap ban kinh hinh tron");
                double r= scanner.nextDouble();

                double parameter=2*PI*r;
                double area=PI*Math.pow(r,2);

                System.out.println("Chu vi hinh tron la: "+ parameter);
                System.out.println("Dien tich hinh tron la: "+ area);
                break;

            case 4:
                System.exit(1);
                break;

            default:
                System.out.println("Không có lựa chọn này");
                break;
        }

    }
}
