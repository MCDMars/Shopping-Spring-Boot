package com.restful_grad_task.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful_grad_task.shopping.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    
}
