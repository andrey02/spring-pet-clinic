package com.andrei.springpetclinic.Services;

import com.andrei.springpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner,Long> {

    Owner findByLastName(String lastName);
}
