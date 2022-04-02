package com.example.fullstack_development.travelAdventure;

import java.util.Objects;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping()
public class TravelAdventuresController {

    private final AdventureRepository adventureRepository;

    public TravelAdventuresController(AdventureRepository adventureRepo) {
        this.adventureRepository = adventureRepo;
    }

    // Add controller methods below:
    @GetMapping("/traveladventures")
    public Iterable<Adventure> findAll() {
        return this.adventureRepository.findAll();
    }

    @GetMapping("/traveladventures/bycountry/{country}")
    public Iterable<Adventure> findByCountry(@PathVariable("country") String countryName){
        if(countryName.isEmpty()){
            throw new Error("Country cannot be empty");
        }
        return this.adventureRepository.findByName(countryName);
    }

    @GetMapping("/traveladventures/bystate")
    public Iterable<Adventure> findByState(@RequestParam String state){
        if(state.isEmpty()){
            throw new Error("State cannot be null");
        }
        return this.adventureRepository.findByState(state);
    }

    @PostMapping("/traveladventures")
    public void createAdventure(@RequestBody Adventure newAdventure){
        if(Objects.isNull(newAdventure)){
            throw new Error("Not a valid object");
        }
        this.adventureRepository.save(newAdventure);
    }

    @PutMapping("/traveladventures/{id}")
    public void updateAdventure(HttpServletResponse response, @RequestBody Adventure newAdventure, @PathVariable("id")Integer adventureId)
        throws Exception {
        if(this.adventureRepository.findById(adventureId).isPresent()){
            Adventure adventureSave = this.adventureRepository.getById(adventureId);
            adventureSave.setBlogCompleted(newAdventure.getBlogCompleted());
            this.adventureRepository.save(adventureSave);
        }else{
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not exist");

        }
    }

    @DeleteMapping("/traveladventures/{id}")
    public void deleteAdventureById(@PathVariable("id")Integer adventureId){
        if(this.adventureRepository.findById(adventureId).isPresent()){
            this.adventureRepository.deleteById(adventureId);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not exist");
        }
    }

}
