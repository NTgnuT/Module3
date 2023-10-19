package ra.bussiness;

import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;

    private static int newID = 1;
    private String catalogName;

    private int priority;

    private String descriptions;

    private boolean catalogStatus;

    public Catalog() {
        this.catalogId = Catalog.newID++;
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = newID++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public static int getNewID() {
        return newID;
    }

    public static void setNewID(int newID) {
        Catalog.newID = newID;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục sản phẩm");
        while (true) {
            this.catalogName = scanner.nextLine();
            if (catalogName.isEmpty()) {
                System.err.println("Tên danh mục không được để trống!");
            } else {
                break;
            }
        }

        System.out.println("Nhập độ ưu tiên");
        this.priority = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập mô tả danh mục");
        while (true) {
            this.descriptions = scanner.nextLine();
            if (descriptions.isEmpty()) {
                System.err.println("Mô tả không được để trống");
            } else {
                break;
            }
        }

        System.out.println("Nhập trạng thái danh mục");
        this.catalogStatus = scanner.nextLine().isEmpty();

    }

    @Override
    public void displayData() {
        System.out.printf("Catalog ID: %d, catalog Name: %s", catalogId, catalogName);
    }
}
