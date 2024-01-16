package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    public static final IProductRepository i = new ProductRepository();

    @Override
    public void findAll(Product product1) {
        i.findAll(product1);
    }

    @Override
    public List<Product> all() {
        return i.all();
    }

    @Override
    public Product up(String ma) {
        return i.up(ma);
    }

    @Override
    public void upProduct(Product product1) {
        i.upProduct(product1);
    }

    @Override
    public void removeProduct(String ma) {
        i.removeProduct(ma);
    }

    @Override
    public void max() {
        i.max();
    }

    @Override
    public void sortProduct() {
        i.sortProduct();
    }
}
