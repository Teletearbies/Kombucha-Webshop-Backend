package com.example.kombuchawebshopbackend.Common;

import com.example.kombuchawebshopbackend.Entity.Beverage;
import com.example.kombuchawebshopbackend.Repository.BeverageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialData implements CommandLineRunner {

    BeverageRepository beverageRepository;

    public InitialData(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Beverage beverage1 = new Beverage("Green beans",50,"It tastes like fart", 10);
        Beverage beverage2 = new Beverage("Pineapple",55,"Drank worse", 10);

        beverageRepository.save(beverage1);
        beverageRepository.save(beverage2);
    }
}
