package com.kshrd.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kshrd.model.Property;
import com.kshrd.model.User;
import com.kshrd.repository.PropertyRepository;

@RepositoryRestController
public class PropertyRestController {

	@Autowired
	private PropertyRepository pRepo;
	
	@PostMapping("/posters/{id}/properties")
	public ResponseEntity<?> saveProperty(@RequestBody Property property, @PathVariable Integer id, User poster){
		poster.setId(id);
		property.setPoster(poster);
		pRepo.save(property);
		return new ResponseEntity<Property>(HttpStatus.CREATED);
	}
	
	
	
	
}
