package com.example.fullstack_development.repository;

import com.example.fullstack_development.entities.Car;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
    public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

    List<Car> findByBrand(@Param("brand")String brand);

    List<Car> findCarByColor(@Param("color")String color);


}
