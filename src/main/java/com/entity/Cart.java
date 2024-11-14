package com.entity;

import java.math.BigDecimal;
import java.util.List;

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


public class Cart {
    // Class member will uniquely identify the entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private Long cartId;
    private String usderId;
    private List<Product> productsInCart;
    private Boolean couponApplied;
    private BigDecimal finalAmountToBePaid;
}
