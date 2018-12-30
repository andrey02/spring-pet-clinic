package com.andrei.springpetclinic.bootstrap;

import com.andrei.springpetclinic.model.*;
import com.andrei.springpetclinic.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FakeDataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialityService specialityService;

    @Autowired
    public FakeDataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        //owner
        Owner owner = new Owner(1L,"Andrei","Teixeira");
        Owner owner1 = new Owner(2L,"Jorge","Teixeira");
        Owner owner2 = new Owner(3L,"Rebeca","Teixeira");
        Owner owner3 = new Owner(4L,"Georgina", "Teixeira");

        owner.setAddress("Avenida Bonita, 970");
        owner1.setAddress("Avenida Bonita, 970");
        owner2.setAddress("Avenida Bonita, 970");
        owner3.setAddress("Avenida Bonita, 970");

        owner.setCity("São Paulo");
        owner1.setCity("São Paulo");
        owner2.setCity("São Paulo");
        owner3.setCity("São Paulo");

        owner.setTelephone("(11) 37465748");
        owner1.setTelephone("(11) 37465748");
        owner2.setTelephone("(11) 37465748");
        owner3.setTelephone("(11) 37465748");

        //vet
        Vet vet = new Vet(1L,"Maria", "Cabral");
        Vet vet1 = new Vet(2L,"Tereza", "Cristina");

        Speciality speciality = new Speciality(1L);
        speciality.setDescription("First");
        Speciality speciality1 = new Speciality(2L);
        speciality1.setDescription("Second");

        vet.getSpecialities().add(speciality);
        vet1.getSpecialities().add(speciality1);

        //Pet
        PetType dog = new PetType(1L,"Dog");
        PetType cat = new PetType(2L,"Cat");

        Pet pet = new Pet(1L,dog,owner, LocalDate.now());
        pet.setName("Doguinho");
        Pet pet1 = new Pet(1L,cat,owner1, LocalDate.now());
        pet1.setName("Gatinho");
        Pet pet2 = new Pet(1L,cat,owner2, LocalDate.now());
        pet2.setName("Gatinho1");
        Pet pet3 = new Pet(1L,dog,owner3, LocalDate.now());
        pet3.setName("Doguinho1");

        //Owner x pets

        owner.getPets().add(pet);
        owner1.getPets().add(pet1);
        owner2.getPets().add(pet2);
        owner3.getPets().add(pet3);

        //Save them all
        petTypeService.Save(dog);
        petTypeService.Save(cat);

        petService.Save(pet);
        petService.Save(pet1);
        petService.Save(pet2);
        petService.Save(pet3);

        specialityService.Save(speciality);
        specialityService.Save(speciality1);

        vetService.Save(vet);
        vetService.Save(vet1);

        ownerService.Save(owner);
        ownerService.Save(owner1);
        ownerService.Save(owner2);
        ownerService.Save(owner3);

        System.out.printf("Loaded Map data......");
    }
}
