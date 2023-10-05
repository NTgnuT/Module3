package TH.DanhMucVaSanPham;

import java.util.Scanner;

public class Category {
    private int categoryId;

    private String categoryName;

    public Category() {}

    public Category (int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

//    public void inputData () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập ID danh mục: ");
//        categoryId = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập tên danh mục: ");
//        categoryName = scanner.nextLine();
//    }

    public void displayData () {
        System.out.println("Mã danh mục: " + categoryId + ", tên danh mục: " + categoryName );
    }


}
