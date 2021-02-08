package com.jpr.hardwares.product.controller;

import com.jpr.hardwares.product.models.Items;
import com.jpr.hardwares.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/jpr/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("getProducts")
    public List<Items> getAllProductItems(){
        log.info("getting All the product items");
        return productService.getAllProducts();
    }
}
