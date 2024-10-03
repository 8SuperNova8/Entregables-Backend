package com.plant.Reto4.services;


import com.plant.Reto4.models.Plant;
import com.plant.Reto4.repositories.PlantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepo ;
    private Plant plant;

    public List<Plant> getPlants(){ // hace la consulta de todos los elementos
        return plantRepo.findAll();
    }

    public Optional<Plant> getPlant(Long id){ // consulta un solo elemento
        return plantRepo.findById(id);
    }

    public void addPlant (@RequestBody Plant plant) {
        plantRepo.save(plant);
    }


    public void addPlants (@RequestBody ArrayList <Plant> plants) {//permite agregar Varios
        plantRepo.saveAll(plants);
    }

    public Plant updatePlant (@RequestBody Plant plant) {//actualiza PUT
        Optional<Plant> findPlant = plantRepo.findById(plant.getId());

        if(findPlant.isPresent()) {
            Plant plantToUpdate = findPlant.get();
            //aqui actulizo lo campos
            BeanUtils.copyProperties(plant, plantToUpdate, "id");
            return plantRepo.save(plantToUpdate);
        }else {
            return null;
        }
    }



    public void delete(Long id) {
        plantRepo.deleteById(id);
    }
}
