package com.example.lab01.repositories.impl;

import java.util.List;

import com.example.lab01.daos.PersonDBRepository;
import com.example.lab01.entities.PersonEntity;
import com.example.lab01.repositories.PersonRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@AllArgsConstructor
public class PersonRepositoryImpl implements PersonRepository {

    private final PersonDBRepository personDBRepository;
    
    @Override
    public List<PersonEntity> findAll() {
        return personDBRepository.findAll();
    }

    @Override   
    public PersonEntity findById(Long id) {
        return personDBRepository.findById(id).orElse(null);
    }

    @Override
    public void save(PersonEntity person) {
        personDBRepository.save(person);
    }
}
