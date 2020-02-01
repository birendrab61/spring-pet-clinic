package com.pathakbimal.springpetclinic.services;

import com.pathakbimal.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}

