package TH.DanhMucVaSanPham;

public class Main {
    public static void main(String[] args) {
        // Tạo 2 danh mục
        Category c1 = new Category(1, "quần");
        Category c2 = new Category(2, "áo");

        // Tạo các sản phẩm thuộc danh mục 1
        Product p1 = new Product(1, "Quần Âu", 150000, c1);
        Product p2 = new Product(2, "Quần Jean", 200000, c1);

        // Tạo các sản phẩm thuộc danh mục 2
        Product p3 = new Product(3, "Áo Phông", 120000, c2);
        Product p4 = new Product(4, "Áo sơ mi", 180000, c2);

        System.out.println("Tất cả danh mục");
        c1.displayData();
        c2.displayData();

        System.out.println("Tất cả sản phẩm");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
        p4.displayProduct();
    }
}
