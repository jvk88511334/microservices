package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product productfindById(int id);
    Product save(Product product);
}
