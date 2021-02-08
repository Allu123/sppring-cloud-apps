package com.jpr.hardwares.product.repository;

import com.jpr.hardwares.product.models.Items;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositroy  extends MongoRepository<Items,Long> {
}
