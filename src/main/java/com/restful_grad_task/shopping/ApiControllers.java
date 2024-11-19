package com.restful_grad_task.shopping;

import org.springframework.web.bind.annotation.RestController;

import com.restful_grad_task.shopping.entity.Product;
import com.restful_grad_task.shopping.repo.ProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController

public class ApiControllers {
    @Autowired
    private ProductRepo productRepo;
    
    @GetMapping(value = "/")
    public String getPage() {
        return "Testing";
    }

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return productRepo.findAll();
    }
}
