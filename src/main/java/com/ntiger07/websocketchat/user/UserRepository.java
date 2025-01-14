package com.ntiger07.websocketchat.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{

    List<User> findAllByStatus(Status online);
    
}
