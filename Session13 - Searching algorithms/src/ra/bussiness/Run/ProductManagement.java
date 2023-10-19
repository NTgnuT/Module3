package ra.bussiness.Run;

import ra.bussiness.Catalog;
import ra.bussiness.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static List<Catalog> catalogList = new ArrayList<>();
    static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("------MENU------");
            System.out.println("1. Nhập số lượng danh mục sản phẩm và thông tin các danh mục.");
            System.out.println("2. Nhập số lượng sản phẩm và thông tin sản phẩm.");
            System.out.println("3. Sắp xếp sản phẩm theo giá tăng dần.");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục");
            System.out.println("5. Thoát");
            System.out.println("===================");
            System.out.println("Nhập lựa chọn của bạn.");
            int choise = Integer.parseInt(scanner.nextLine());
            handleChoise(choise);
        }
    }

    private static void handleChoise(int choise) {
        switch (choise) {
            case 1:
                addCatalog();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                sortProduct();
                break;
            case 4:
                findProduct();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.err.println("Không có lựa chọn này!");
        }
    }

    private static void findProduct() {
    }

    private static void sortProduct() {
    }

    private static void addProduct() {
    }

    private static void addCatalog() {
        System.out.println("Nhập số lượng danh mục bạn muốn thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập danh mục thứ: " + (i+1));
            Catalog c = new Catalog();
            c.inputData();
            catalogList.add(c);
        }
    }
}
