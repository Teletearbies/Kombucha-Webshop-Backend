package com.example.kombuchawebshopbackend.Service;

import com.example.kombuchawebshopbackend.Entity.Beverage;
import com.example.kombuchawebshopbackend.Repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    private final BeverageRepository beverageRepository;

    @Autowired
    public BeverageService(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    public List<Beverage> getAllBeverages() {
        return beverageRepository.findAll();
    }

    public Beverage getBeverageById(Long id) {
        return beverageRepository.findById(id).orElse(null);
    }

    public Beverage createBeverage(Beverage beverage) {
        return beverageRepository.save(beverage);
    }

    public void deleteBeverage(Long id) {
        beverageRepository.deleteById(id);
    }

    public Beverage updateBeverage(Long id, Beverage beverage) {
        if (beverageRepository.findById(id).isEmpty()) {
            return null;
        }
        return beverageRepository.save(beverage);
    }
}