package com.restful_grad_task.shopping.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;
import scala.collection.immutable.List;

// Marking as an entity using JPA
@Entity
// Marking as transactional, meaning changes will be executed within a transaction. Changes pushed on success, rolled back if failed
@Transactional
// Marking as data for implicit getter setter arguments
@Data
@NoArgsConstructor


public class Transactions {
    // Class member will uniquely identify the entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trans_id")
    private Long transId;
    /*@Column
    private List<Product> shoppedProducts;*/
    @Column
    private BigDecimal amountPaid;
    @Column
    private Date shoppingDate;
    @Column
    private Long userId;
}


