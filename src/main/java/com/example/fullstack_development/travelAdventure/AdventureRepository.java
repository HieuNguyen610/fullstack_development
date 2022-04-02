package com.example.fullstack_development.travelAdventure;

import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdventureRepository extends JpaRepository<Adventure, Integer> {

    @Query(value = "Select * from adventures where country like %:countryName%", nativeQuery = true)
    Iterable<Adventure> findByName(@Param("countryName") String countryName);

    @Query(value = "Select * from adventures where state like %:state%", nativeQuery = true)
    Iterable<Adventure> findByState(@Param("state") String state);
}
