package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarsRepository repository;

    @Override
    public void run (String... strings) throws Exception{
        Cars cars;
        cars = new Cars("Saturn", "Dodger", 1997);
        repository.save(cars);

        cars = new Cars("Toyota", "Corella", 2000);
        repository.save(cars);

        cars = new Cars("Toyota", "Avalon", 2007);
        repository.save(cars);
    }
}
