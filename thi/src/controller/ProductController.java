package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import java.util.List;

public class ProductController {
    public static final IProductService a = new ProductService();

    public void findAll(Product product1) {
        a.findAll(product1);
    }

    public List<Product> all() {

        return a.all();
    }

    public Product up(String ma) {

        return a.up(ma);
    }

    public void upProduct(Product product1) {
        a.upProduct(product1);
    }

    public void removeProduct(String ma) {
        a.removeProduct(ma);
    }

    public void max() {
        a.max();
    }

    public void sortProduct() {
        a.sortProduct();
    }
}
