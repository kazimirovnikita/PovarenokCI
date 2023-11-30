package ru.spbstu.povarenok.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Cuisine {

    Long id;
    String name;

    public Cuisine(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
