package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Speciality;
import com.andrei.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile ({"default","map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {
}
