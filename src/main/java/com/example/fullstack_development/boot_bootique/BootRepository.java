package com.example.fullstack_development.boot_bootique;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootRepository extends CrudRepository<Boot, Integer>{


    Iterable<Boot> findBootsByMaterial(String material);

    Iterable<Boot> findBootsByTypeAndMaterial(String type, String meterial);
}
