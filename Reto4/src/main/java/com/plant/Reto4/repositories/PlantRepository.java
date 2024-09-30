package com.plant.Reto4.repositories;

import com.plant.Reto4.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //ORM objet relation mapes- es la conexion de la aplicacion con la base de datos

public interface PlantRepository extends JpaRepository<Plant, Long> { //(dentro de los +- se ingresa el obejto o entidad y el tipo de ID) siempre lo tenemos que hacer Extends jpaRepository que es el que estamos usando

}
