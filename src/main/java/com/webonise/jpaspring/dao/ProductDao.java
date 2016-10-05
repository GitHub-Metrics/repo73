package com.webonise.jpaspring.dao;

import com.webonise.jpaspring.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
    Product findById(int id);

    Product findByPrice(int price);
}