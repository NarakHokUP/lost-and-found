package com.kshrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
