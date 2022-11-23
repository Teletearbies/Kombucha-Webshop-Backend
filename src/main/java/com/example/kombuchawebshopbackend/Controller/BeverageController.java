package com.example.kombuchawebshopbackend.Controller;

import com.example.kombuchawebshopbackend.Entity.Beverage;
import com.example.kombuchawebshopbackend.Service.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BeverageController {

    private final BeverageService beverageService;

    @Autowired
    public BeverageController(BeverageService beverageService) {
        this.beverageService = beverageService;
    }

    @GetMapping("/beverages")
    public List<Beverage> getAllBeverages() {
        return beverageService.getAllBeverages();
    }

    @GetMapping("/beverages/{id}")
    public ResponseEntity<Beverage> getActivityById(@PathVariable("id") Long id) {
        Beverage beverage = beverageService.getBeverageById(id);
        return new ResponseEntity<>(beverage, HttpStatus.OK);
    }

    @PostMapping("/beverages")
    public ResponseEntity<Beverage> createBeverage(@RequestBody Beverage beverage) {
        Beverage newBeverage = beverageService.createBeverage(beverage);
        return new ResponseEntity<>(newBeverage, HttpStatus.CREATED);
    }

    @PutMapping("/beverages/{id}")
    public ResponseEntity<Beverage> updateBeverage(@RequestBody Beverage beverage, @PathVariable("id") Long id) {
        return new ResponseEntity<>(beverageService.updateBeverage(id, beverage), HttpStatus.OK);
    }

    @DeleteMapping("/beverages/{id}")
    public ResponseEntity<?> deleteBeverage(@PathVariable("id") Long id) {
        beverageService.deleteBeverage(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
