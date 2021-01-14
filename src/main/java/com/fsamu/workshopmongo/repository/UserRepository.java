package com.fsamu.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fsamu.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}