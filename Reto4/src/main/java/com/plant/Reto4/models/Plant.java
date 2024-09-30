package com.plant.Reto4.models;

import jakarta.persistence.*;

@Entity
@Table(name="plants")

public class Plant {
    //propiedades o atributos
    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //este es el auto incremento
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sizeCm")
    private Double size_cm;

    @Column(name = "environment")
    private String environment;

    @Column(name = "color")
    private String color;

    @Column(name = "origin")
    private String origin;

    //constructor
    public Plant(){ //vacio cuando es una entidad

    }
//    getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSizeCm() {
        return size_cm;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getColor() {
        return color;
    }

    public String getOrigin() {
        return origin;
    }

    //    setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSizeCm(Double size_cm) {
        this.size_cm = size_cm;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
