package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.Owner;
import com.andrei.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {

        Owner value = null;
        for (Map.Entry<Long, Owner> entry : map.entrySet()) {
            if (entry.getValue().getLastName().equals(lastName)) value = entry.getValue();
        }

        return value;
    }

}
