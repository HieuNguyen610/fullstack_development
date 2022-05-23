package com.example.fullstack_development.plant;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PlantRepository extends CrudRepository<Plant, Integer> {

    List<Plant> findByHasFruitTrue();
    List<Plant> findPlantsByHasFruitFalse();
    List<Plant> findPlantsByQuantityLessThan(Integer quantity);
    List<Plant> findPlantsByHasFruitTrueAndQuantityLessThan(Boolean hasFruit, Integer quantity);
    List<Plant> findPlantsByHasFruitFalseAndQuantityLessThan(Boolean hasFruit, Integer quantity);


}
