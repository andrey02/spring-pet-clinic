package com.andrei.springpetclinic.bootstrap;

import com.andrei.springpetclinic.model.Owner;
import com.andrei.springpetclinic.model.Vet;
import com.andrei.springpetclinic.services.OwnerService;
import com.andrei.springpetclinic.services.VetService;
import com.andrei.springpetclinic.services.map.OwnerServiceMap;
import com.andrei.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FakeDataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public FakeDataLoader() {
        this.ownerService = new OwnerServiceMap(); //map based implementations, o certo seria fazer um autowired e o spring saber qula é a implementação baseado do @Profile
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner(1L,"Andrei","Teixeira");
        Owner owner1 = new Owner(2L,"Jorge","Teixeira");
        Owner owner2 = new Owner(3L,"Rebeca","Teixeira");
        Owner owner3 = new Owner(4L,"Georgina", "Teixeira");

        ownerService.Save(owner.getId(),owner);
        ownerService.Save(owner1.getId(),owner1);
        ownerService.Save(owner2.getId(),owner2);
        ownerService.Save(owner3.getId(),owner3);

        Vet vet = new Vet(1L,"Maria", "Cabral");
        Vet vet1 = new Vet(2L,"Tereza", "Cristina");

        vetService.Save(vet.getId(),vet);
        vetService.Save(vet1.getId(),vet1);

        System.out.printf("LoadedMap data......");


//        PetType petType = new PetType(1L,"Chiuaua");
//        PetType petType1 = new PetType(2L,"Bulldog");
//
//        Pet pet = new Pet(1L,petType,owner, new LocalDate(2016,05,21);
//        Pet pet1 = new Pet(1L,petType,owner1, new LocalDate(2016,05,21);
//        Pet pet2 = new Pet(1L,petType1,owner2, new LocalDate(2016,05,21);
//        Pet pet3 = new Pet(1L,petType,owner3, new LocalDate(2016,05,21);


    }
}
