package com.andrei.springpetclinic.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class PetType extends BaseEntity {

    private String name;

    @OneToMany (mappedBy = "petType")
    private Set<Pet> pets = new HashSet<>();

    public PetType(String name) {
        this.name = name;
    }

    public PetType() {

    }


}
