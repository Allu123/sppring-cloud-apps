package com.jpr.hardwares.product.service;

import com.jpr.hardwares.product.models.Items;
import com.jpr.hardwares.product.repository.ProductRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepositroy productRepositroy;

    @Override
    public List<Items> getAllProducts() {

        return productRepositroy.findAll();
    }
}
