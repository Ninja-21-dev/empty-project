package com.springboot.ecommerce.repository;

import com.springboot.ecommerce.model.Product;

import java.util.List;

public interface ProductDao {
    public int addProduct(Product product);
    public void deleteProduct(int id);
    public int updateProduct(Product product);
    public Product findProductById(int id);
    public List<Product> getProducts();
}