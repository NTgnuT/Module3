package BT.baitap1;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String factory;
    private double price;
    private String descriptions;

    public Product() {
    }

    public Product(int productId, String productName, String factory, double price, String descriptions) {
        this.productId = productId;
        this.productName = productName;
        this.factory = factory;
        this.price = price;
        this.descriptions = descriptions;
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

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
