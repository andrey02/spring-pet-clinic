package com.andrei.springpetclinic.Services;

import com.andrei.springpetclinic.Model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
