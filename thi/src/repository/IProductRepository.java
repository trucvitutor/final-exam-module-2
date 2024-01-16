package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {

    void findAll(Product product1);

    List<Product> all();

    Product up(String ma);

    void upProduct(Product product1);

    void removeProduct(String ma);

    void max();

    void sortProduct();

}
