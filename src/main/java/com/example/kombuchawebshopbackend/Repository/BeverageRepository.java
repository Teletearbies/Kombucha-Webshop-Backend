package com.example.kombuchawebshopbackend.Repository;

import com.example.kombuchawebshopbackend.Entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
