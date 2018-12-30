package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.PetType;
import com.andrei.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
}
