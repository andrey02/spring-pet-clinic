package com.andrei.springpetclinic.Services;

import java.util.Set;

public interface CRUDService<T,ID> {

    Set<T> findAll();

    T findAllById(ID id);

    T Save(T object);

    void delete(T object);

    void deleteById(ID id);
}
