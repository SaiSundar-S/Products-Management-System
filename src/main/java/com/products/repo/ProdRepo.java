package com.products.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Product;

@Repository
public interface ProdRepo  extends JpaRepository<Product, Integer>{

}
