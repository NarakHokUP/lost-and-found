package com.kshrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kshrd.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
