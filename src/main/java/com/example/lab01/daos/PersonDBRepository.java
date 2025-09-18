package com.example.lab01.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab01.entities.PersonEntity;

// CrudRepository
// PagingAndSortingRepository
// JpaRepository

public interface PersonDBRepository extends JpaRepository<PersonEntity, Long> {
    
}
