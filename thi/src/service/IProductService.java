package service;

import model.Product;

import java.util.List;

public interface IProductService {
    void findAll(Product product1);

    List<Product> all();

    Product up(String ma);

    void upProduct(Product product1);

    void removeProduct(String ma);

    void max();

    void sortProduct();

}
