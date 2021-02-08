package com.jpr.hardwares.jprservice.repository;

import com.jpr.hardwares.jprservice.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {
}
