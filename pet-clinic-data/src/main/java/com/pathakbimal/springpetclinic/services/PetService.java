package com.pathakbimal.springpetclinic.services;

import com.pathakbimal.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
