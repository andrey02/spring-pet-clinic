package com.andrei.springpetclinic.model;

import javax.persistence.Entity;

@Entity
public class PetType extends BaseEntity {

    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
