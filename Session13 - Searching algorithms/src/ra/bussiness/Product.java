package ra.bussiness;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop{
    private int productId;

    private int newId = 1;

    private String productName;

    private String title;

    private String descriptions;

    private Catalog catalog;

    private float importPrice;

    private float exportPrice;

    private boolean status;

    public Product() {
        this.productId = newId++;
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean status) {
        this.productId = newId++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.status = status;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {}
    public void inputData(List<Catalog> catalogs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm.");
        this.productName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm.");
        this.title = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm.");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập giá nhập sản phẩm.");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập trạng thái sản phẩm.");
        this.status = scanner.nextLine().isEmpty();
        // Chọn danh mục cho sản phẩm
//        System.out.println("Danh sách các danh mục");
//        for (int i = 0; i < catalogs.size(); i++) {
//            System.out.println(i + 1 + ". " +catalogs.get(i).getCatalogName());
//        }
//        System.out.println("Mời nhập số thứ tự để lựa chọn danh mục");
//        int choice = Integer.parseInt(scanner.nextLine());
//        if (choice >= 1 && choice <= catalogs.size()) {
//            this.catalog = catalogs.get(choice - 1);
//        } else {
//            System.out.println("Lựa chọn không có trong danh mục");
//        }

        // Chọn danh mục của product theo catalogId
        System.out.println("Danh sách các danh mục");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println(i + 1 + ". " +catalogs.get(i).getCatalogName());
        }
        System.out.println("Mời nhập số thứ tự để lựa chọn danh mục");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < catalogs.size(); i++) {

        }
    }

    public float export () {
        return importPrice * RATE;
    }

    @Override
    public void displayData() {
        System.out.printf("Product ID: %d, product name: %s, catalog name: %s, export price: %f, status: %s",
                productId, productName, catalog.getCatalogName(), export(), status? "Còn hàng": "Hết hàng");
    }
}
