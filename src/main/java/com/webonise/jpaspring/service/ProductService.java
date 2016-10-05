package com.webonise.jpaspring.service;

import com.webonise.jpaspring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webonise.jpaspring.dao.ProductDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> getCustomers() {
        Iterator<Product> iterator = productDao.findAll().iterator();
        List<Product> products = new ArrayList<>();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            products.add(product);
        }

        return products;
    }

    public Product findById(int id) {
       return productDao.findById(id);

    }

    public Product findByPrice(int price) {
       return productDao.findByPrice(price);


    }


}
