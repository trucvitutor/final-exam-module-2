package repository;

import common.FileService;
import model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String FILE = "src/data/product.txt";

    @Override
    public void findAll(Product product1) {
        List<Product> products = FileService.readFile(FILE);
        products.add(product1);
        FileService.writeFile(FILE, products);
    }

    @Override
    public List<Product> all() {
        List<Product> products = FileService.readFile(FILE);
        return products;
    }

    @Override
    public Product up(String ma) {
        List<Product> products = FileService.readFile(FILE);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMa().equals(ma)) {
                return products.get(i);

            }
        }
        return null;
    }

    @Override
    public void upProduct(Product product1) {
        List<Product> products = FileService.readFile(FILE);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMa().equals(product1.getMa())) {
                products.get(i).setTen(product1.getTen());
                products.get(i).setGia(product1.getGia());
                products.get(i).setMoTa(product1.getMoTa());
                products.get(i).setSoLuong(product1.getSoLuong());
            }
        }
        FileService.writeFile(FILE, products);
    }

    @Override
    public void removeProduct(String ma) {
        List<Product> products = FileService.readFile(FILE);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMa().equals(ma)) {
                products.remove(products.get(i));
            }
        }
        FileService.writeFile(FILE, products);
    }

    @Override
    public void max() {
        List<Product> products = FileService.readFile(FILE);
        List<Product> list = new ArrayList<>();
        double max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getGia() > max) {
                max = products.get(i).getGia();
            }
        }
        for (int i = 0; i < products.size(); i++) {
            if (max == products.get(i).getGia()) {
                list.add(products.get(i));
            }
        }
        System.out.println("sản phẩm có giá trị lớn nhất " + list);
    }

    @Override
    public void sortProduct() {
        List<Product> products = FileService.readFile(FILE);
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }

    }
}
