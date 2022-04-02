package com.example.fullstack_development.plant;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {
    private final PlantRepository plantRepository;

    public PlantController(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Iterable<Plant> getAllPlants(){
        return plantRepository.findAll();
    }
}
