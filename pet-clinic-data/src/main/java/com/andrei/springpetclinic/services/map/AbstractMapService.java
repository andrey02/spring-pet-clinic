package com.andrei.springpetclinic.services.map;

import com.andrei.springpetclinic.model.BaseEntity;
import com.andrei.springpetclinic.services.CRUDService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CRUDService<T, ID> {

    protected Map<Long, T> map = new HashMap<>();


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }


    public T findById(ID id) {
        return map.get(id);
    }


    public T Save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextLong());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object não pode ser nulo, please!");
        }
        return object;
    }


    public void deleteById(ID id) {
        map.remove(id);
    }


    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextLong() {
        return Collections.max(map.keySet()) + 1;
    }
}
