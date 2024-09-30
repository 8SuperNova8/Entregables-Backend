package com.plant.Reto4.controllers;

import com.plant.Reto4.models.Plant;
import com.plant.Reto4.repositories.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlantController {

    @Autowired  // conecta con el repository
    private PlantRepository plantRepo;

    @GetMapping("/plant")
    public List<Plant> plants (){
        return plantRepo.findAll();
    }

    @PostMapping ("/plant")
    public void createPlant (@RequestBody Plant plant) {
        plantRepo.save(plant);
    }

    @PutMapping("/plant")
    public void updatePlant(@RequestBody Plant num) {
        Optional<Plant> findPlant = plantRepo.findById(num.getId());
        if(findPlant != null) {
            plantRepo.save(num);
        }
    }

    @DeleteMapping ("/plant/{id}")
    public String deletePlant (@PathVariable Long id){
        plantRepo.deleteById(id);
        return String.format("Se eliminó la planta con ID %s", id);
    }


}
