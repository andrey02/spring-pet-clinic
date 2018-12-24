package com.andrei.springpetclinic.Services.map;

import com.andrei.springpetclinic.Model.Owner;
import com.andrei.springpetclinic.Services.OwnerService;

import java.util.Map;
import java.util.Set;

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
