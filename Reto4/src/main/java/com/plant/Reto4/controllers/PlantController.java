package com.plant.Reto4.controllers;

import com.plant.Reto4.models.Plant;
import com.plant.Reto4.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/plant")
public class PlantController {

    @Autowired  // conecta con el repository
    private PlantService plantService;

    @GetMapping
        public List<Plant>getAll(){
        return  plantService.getPlants();
    }

    @GetMapping("/{id}")
    public Optional<Plant> getID(@PathVariable("id") Long id){
        return  plantService.getPlant(id);
    }

    @PostMapping
     public void addPlant(@RequestBody Plant plant){
         plantService.addPlant(plant);
    }

    @PostMapping ("/plants")//para muchas
    public void addPlants(@RequestBody ArrayList<Plant> plants){
        plantService.addPlants(plants);
    }

    @PutMapping
    public void updatePlant(@RequestBody Plant plant){
        plantService.updatePlant(plant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        plantService.delete(id);
    }

}
