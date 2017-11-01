package com.kshrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;

@Repository
@RepositoryRestResource(path="posters", itemResourceRel = "posters")
public interface UserRepository extends JpaRepository<User, Integer>{

}
