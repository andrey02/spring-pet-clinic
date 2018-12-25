package com.andrei.springpetclinic.services;

import com.andrei.springpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner,Long> {

    Owner findByLastName(String lastName);
}
