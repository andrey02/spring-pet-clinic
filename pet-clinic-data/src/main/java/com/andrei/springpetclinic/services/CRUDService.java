package com.andrei.springpetclinic.services;

import java.util.Set;

public interface CRUDService<T,ID> {

    Set<T> findAll();

    T findAllById(ID id);

    T Save(ID id,T object);

    void delete(T object);

    void deleteById(ID id);
}
