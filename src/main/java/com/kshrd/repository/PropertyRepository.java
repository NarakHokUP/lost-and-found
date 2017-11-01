package com.kshrd.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.kshrd.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer>{
	
	@RestResource(path="type", rel="type")
	Page<Property> findByType(@Param("type") String type, @Param("pageable") Pageable pageable);
	
}
