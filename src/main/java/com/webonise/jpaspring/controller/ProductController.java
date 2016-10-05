package com.webonise.jpaspring.controller;

import com.webonise.jpaspring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.webonise.jpaspring.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getProduct() {
        return productService.getCustomers();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        return productService.findById(id);

    }

    @RequestMapping(value = "/find/{price}", method = RequestMethod.GET)
    public Product getProductByName(@PathVariable int price){
        return productService.findByPrice(price);
    }

}
