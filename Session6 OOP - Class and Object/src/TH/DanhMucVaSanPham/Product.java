package TH.DanhMucVaSanPham;

import java.util.Scanner;

public class Product {
    private int productId;

    private String productName;

    private float productPrice;

    Category category;

    public Product () {}

    public Product (int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public void displayProduct() {
        System.out.println(
                "Product{" +
                        "productId=" + productId +
                        ", productName='" + productName + '\'' +
                        ", productPrice=" + productPrice +
                        ", category=" + category.getCategoryName() +
                        '}'
        );
    }
}
