package com.andrei.springpetclinic.services.springdatajpa;

import com.andrei.springpetclinic.model.Owner;
import com.andrei.springpetclinic.repositories.OwnerRepository;
import com.andrei.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerSDJpaService implements OwnerService {

    OwnerRepository ownerRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {

        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    public Owner findById(Long aLong) {
        if(ownerRepository.findById(aLong).isPresent())
            return ownerRepository.findById(aLong).get();
        else
            return null;
    }

    @Override
    public Owner Save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
