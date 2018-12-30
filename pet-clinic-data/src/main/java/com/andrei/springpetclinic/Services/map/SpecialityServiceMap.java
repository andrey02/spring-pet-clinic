package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Speciality;
import com.andrei.springpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {
}
