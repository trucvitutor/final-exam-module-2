package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

import static com.oracle.util.Checksums.update;
import static java.nio.file.Files.delete;
import static java.util.Collections.sort;

public class ViewMain {
    public static final Scanner scanner = new Scanner(System.in);
    public static final ProductController product = new ProductController();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----");
            System.out.println("1. Xem danh sách" + "\n" +
                    "2. Thêm mới" + "\n" +
                    "3. Cập nhật" + "\n" +
                    "4. Xóa" + "\n" +
                    "5. Sắp xếp" + "\n" +
                    "6. Tìm sản phẩm có giá trị đắt nhất" + "\n" +
                    "7. Đọc từ file" + "\n" +
                    "8. Ghi từ file" + "\n" +
                    "9. Thoát" + "\n" +
                    "Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Product> products = product.all();
                    display(products);
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    maxProduct();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }
    }

    private void sort() {
        product.sortProduct();
    }

    private void maxProduct() {
        product.max();
    }

    private void delete() {
        System.out.println("nhập mã muốn xóa");
        String ma = scanner.nextLine();
        System.out.println("bạn có muốn xóa sản phẩm này không? " + "\n" +
                " y. (có)" + "\n" +
                "n. (không)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "y":
                product.removeProduct(ma);
                System.out.println("xóa thành công.");
                break;
            case "n":
                break;
        }
    }

    private void update() {
        System.out.println("nhập mã muốn sửa: ");
        String ma = scanner.nextLine();
        Product product1 = product.up(ma);
        if (product1 != null) {
            System.out.println("nhập tên: ");
            String ten = scanner.nextLine();
            System.out.println("nhập giá:");
            double gia = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập số lượng: ");
            int soluong = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập mô tả: ");
            String mota = scanner.nextLine();
            product1.setTen(ten);
            product1.setGia(gia);
            product1.setSoLuong(soluong);
            product1.setMoTa(mota);
            product.upProduct(product1);
        } else {
            System.out.println("không tìm thấy sản phẩm yêu cầu nhập lại:");
        }
    }

    private void addProduct() {
        System.out.println("nhập mã sản phẩm");
        String ma = scanner.nextLine();
        System.out.println("nhập tên: ");
        String ten = scanner.nextLine();
        System.out.println("nhập giá:");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số lượng: ");
        int soluong = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mô tả: ");
        String mota = scanner.nextLine();
        Product product1 = new Product(ma, ten, gia, soluong, mota);
        product.findAll(product1);
    }

    private void display(List<Product> products) {
        for (Product a : products) {
            System.out.println(a);
        }
    }
}
