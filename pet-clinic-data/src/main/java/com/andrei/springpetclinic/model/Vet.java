package com.andrei.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class Vet extends Person {


    @ManyToMany(fetch = FetchType.EAGER) //traz tudo no começo
    @JoinTable(name = "vets_specialty", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Vet() {

    }


}
