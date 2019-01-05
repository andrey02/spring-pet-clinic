package com.andrei.springpetclinic.services.springdatajpa;

import com.andrei.springpetclinic.model.Vet;
import com.andrei.springpetclinic.repositories.SpecialityRepository;
import com.andrei.springpetclinic.repositories.VetRepository;
import com.andrei.springpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile ("springdatajpa")
public class VetSDJpaService implements VetService {

    VetRepository vetRepository;
    SpecialityRepository specialityRepository;

    public VetSDJpaService(VetRepository vetRepository, SpecialityRepository specialityRepository) {
        this.vetRepository = vetRepository;
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        if(vetRepository.findById(aLong).isPresent())
            return vetRepository.findById(aLong).get();
        else
            return null;
    }

    @Override
    public Vet Save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
