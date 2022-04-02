package com.example.fullstack_development.plant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PlantRepository extends CrudRepository<Plant, Integer> {

}
