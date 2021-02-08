package com.jpr.hardwares.cart.repository;


import com.jpr.hardwares.cart.model.Items;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends MongoRepository<Items, Long> {

}
