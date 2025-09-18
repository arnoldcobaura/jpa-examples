package com.example.lab01.repositories;

import java.util.List;

import com.example.lab01.entities.PersonEntity;

public interface PersonRepository {

    List<PersonEntity> findAll();

    PersonEntity findById(Long id);

    void save(PersonEntity person);

    
}
