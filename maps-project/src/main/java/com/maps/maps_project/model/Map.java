package com.maps.maps_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "maps")
@AllArgsConstructor
@NoArgsConstructor
public class Map {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private int population;
    private int size;

    public Map(String name, String description, int population, int size) {
        this.name = name;
        this.description = description;
        this.population = population;
        this.size = size;
    }
}
