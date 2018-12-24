package com.andrei.springpetclinic.Services.map;

import com.andrei.springpetclinic.Services.CRUDService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> implements CRUDService<T,ID>  {

    protected Map<ID,T> map = new HashMap<>();


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }


    public T findAllById(ID id) {
        return map.get(id);
    }


    public T Save(ID id, T object) {
        map.put(id,object);
        return object;
    }


    public void deleteById(ID id) {
        map.remove(id);
    }


    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
