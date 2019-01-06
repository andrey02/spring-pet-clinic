package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Visit;
import com.andrei.springpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile ({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
}
