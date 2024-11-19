package com.restful_grad_task.shopping.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

// Marking as an entity using JPA
@Entity
// Marking as transactional, meaning changes will be executed within a transaction. Changes pushed on success, rolled back if failed
@Transactional
// Marking as data for implicit getter setter arguments
@Data
// Needed for JPA Entity
@NoArgsConstructor



public class Product {
    // Class member will uniquely identify the entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prod_id")
    private Long prodId;
    @Column
    private String prodName;
    @Column
    private String colour;
    @Column
    private String size;
    @Column
    private Boolean onSale;
    @Column
    private String description;
}

