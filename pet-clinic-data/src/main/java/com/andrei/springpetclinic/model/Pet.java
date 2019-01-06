package com.andrei.springpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class Pet extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn (name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn (name = "owner_id")
    private Owner owner;

    private LocalDate birthDate;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "pet")
    //mappedBy procura do outro lado do relacionamento o atributo especificado no nome para fazer o relacionamento
    private Set<Visit> visits = new HashSet<>();


}
