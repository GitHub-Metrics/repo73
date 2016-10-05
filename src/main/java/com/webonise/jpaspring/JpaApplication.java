package com.webonise.jpaspring;

import com.webonise.jpaspring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.webonise.jpaspring.dao.ProductDao;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    @Autowired
    ProductDao productDao;

    @Override
    public void run(String... strings) throws Exception {
        productDao.save(new Product("Powder", 50));

    }

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

}