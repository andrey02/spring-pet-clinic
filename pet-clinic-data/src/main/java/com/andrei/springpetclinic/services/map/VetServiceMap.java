package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Vet;
import com.andrei.springpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile ({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
}
