package com.example.kombuchawebshopbackend.Repository;

import com.example.kombuchawebshopbackend.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
