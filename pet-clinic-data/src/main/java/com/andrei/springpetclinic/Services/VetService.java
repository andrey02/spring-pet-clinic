package com.andrei.springpetclinic.Services;

import com.andrei.springpetclinic.Model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
