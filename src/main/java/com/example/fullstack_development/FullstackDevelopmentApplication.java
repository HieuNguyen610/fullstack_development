package com.example.fullstack_development;

import com.example.fullstack_development.entities.Car;
import com.example.fullstack_development.entities.Owner;
import com.example.fullstack_development.repository.CarRepository;
import com.example.fullstack_development.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FullstackDevelopmentApplication {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FullstackDevelopmentApplication.class, args);
    }

}
