package com.example.fullstack_development.plant;

import java.util.List;
import java.util.Optional;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PlantController {
    private final PlantRepository plantRepository;

    public PlantController(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @GetMapping("/plants")
    public Iterable<Plant> getAllPlants(){
        return this.plantRepository.findAll();
    }

    @GetMapping("/plants/{id}")
    public Optional<Plant> getPlantById(@PathVariable("id") Integer id) {
        return this.plantRepository.findById(id);
    }

    @PostMapping("/plants/create")
    public Plant createNewPlant(@RequestBody Plant newPlant){
        this.plantRepository.save(newPlant);
        return newPlant;
    }

    @PutMapping("plants/update")
    public Plant updatePlant(@PathVariable("id")Integer id, @RequestBody Plant newPlant){
        if(this.plantRepository.findById(id).isEmpty()){
            return null;
        }
        Plant plantToUpdate = this.plantRepository.findById(id).get();
        plantToUpdate.setHasFruit(newPlant.getHasFruit());
        plantToUpdate.setName(newPlant.getName());
        plantToUpdate.setQuantity(newPlant.getQuantity());
        plantToUpdate.setWateringFrequency(newPlant.getWateringFrequency());
        return this.plantRepository.save(plantToUpdate);
    }

    @DeleteMapping("plants/{id}")
    public Plant deletePlant(@PathVariable("id")Integer id){
        Optional<Plant> plantToDeleteOptional = this.plantRepository.findById(id);
        if(plantToDeleteOptional.isEmpty()){
            return null;
        }
        Plant plantToDelete = this.plantRepository.findById(id).get();
        this.plantRepository.deleteById(id);
        return plantToDelete;
    }

    @GetMapping("/plants/search")
    public List<Plant> searchPlant(@RequestParam(name = "hasFruit", required = false)Boolean hasFruit,
        @RequestParam(name="maxQuantity", required=false) Integer quantity){
        return this.plantRepository.findByHasFruitTrue();
    }

}
