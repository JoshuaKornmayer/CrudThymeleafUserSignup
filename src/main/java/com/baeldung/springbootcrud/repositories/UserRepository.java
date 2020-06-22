package com.baeldung.springbootcrud.repositories;

import java.util.List;

import com.baeldung.springbootcrud.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    

    List<User> findByName(String name);
}