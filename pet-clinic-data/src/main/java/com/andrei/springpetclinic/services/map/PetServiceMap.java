package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Pet;
import com.andrei.springpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile ({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
}
