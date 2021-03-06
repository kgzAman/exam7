package com.aman.exam7.repositories;

import com.aman.exam7.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositories extends MongoRepository<User,String> {
    Optional<User>findById(String id);
    Optional<User>findByName(String name);
    Optional<User> getByEmail(String email);
}
