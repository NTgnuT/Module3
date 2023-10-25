package BT.baitap1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class run {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    public static void main(String[] args) throws IOException {
//        products.add(new Product(1, "Bimbim", "Oshi", 10000, "Bim bim tôm cay"));
//        products.add(new Product(2, "Bánh ngọt", "Kinh đô", 12000, "Bánh ngọt nhân"));
//        products.add(new Product(3, "Kẹo", "Oshi", 8000, "Kẹo ngậm"));
//        products.add(new Product(4, "Bánh quy", "Hai ha", 25000, "Bánh quy con cá"));
//
//        File file = new File("src/BT/baitap1/dataProduct.dat");
//        file.createNewFile();
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
//        outputStream.writeObject(products);
//        outputStream.close();

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị sản phẩm.");
            System.out.println("3. Tìm kiếm sản phẩm.");
            System.out.println("0. Thoát.");
            System.out.println("=============");
            System.out.println("Mời nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                addNewProduct();
                break;
            case 2:
                showListProduct();
                break;
            case 3:
                findProduct();
                break;
            case 0:
                break;
            default:
                break;
        }
    }

    private static void findProduct() {
        System.out.println("Nhập tên sản phẩm bạn cần tìm kiếm.");
        String findName = scanner.nextLine();
        boolean check = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().toLowerCase().contains(findName.toLowerCase())){
                readFile();
                System.out.println(products.get(i));
                check = true;
            }
        }

        if (!check) {
            System.out.println("Không tìm thấy sản phẩm bạn cần!!!");
        }

    }

    private static void showListProduct() {
        readFile();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void addNewProduct() {
        System.out.println("Nhập thông tin sản phẩm.");
        Product product = new Product();

        System.out.println("Nhập ID sản phẩm: ");
        product.setProductId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên sản phẩm: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Nhập nơi sản xuất: ");
        product.setFactory(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập mô tả sản phẩm: ");
        product.setDescriptions(scanner.nextLine());

        products.add(product);
        writeFile();
    }

    static public void writeFile() {
        File file = new File("src/BT/baitap1/dataProduct.dat");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        }catch (Exception e) {
            System.out.println("Write error!!!");
        }
    }

    static public void readFile() {
        File file = new File("src/BT/baitap1/dataProduct.dat");

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file !!!");
        } catch (IOException e) {
            System.out.println("File rỗng !!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi đọc file !!!");
        }

    }

}
