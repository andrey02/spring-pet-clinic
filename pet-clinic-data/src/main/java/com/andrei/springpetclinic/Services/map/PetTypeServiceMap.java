package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.PetType;
import com.andrei.springpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile ({"default","map"})
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
}
