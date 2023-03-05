package com.springbd.SpringRestApiPostgre.repository;

import com.springbd.SpringRestApiPostgre.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
