package com.jpr.hardwares.cart.service;

import com.jpr.hardwares.cart.model.Items;
import com.jpr.hardwares.cart.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private ShoppingCartRepository cartRepository;

    @Autowired
    private RestTemplate restTemplate;

//    @Value("${product.endpoint.url}")
//    private String productUrl;

    @Override
    public List<Items> getAllCartItems() {
        restTemplate.getForEntity("http://PRODUCT-SERVICE/api/jpr/products", Items.class);
        return cartRepository.findAll();
    }


    @Override
    public List<Items> saveCartItem(List<Items> item) {
         List<Items> listItems= cartRepository.saveAll(item);
    return listItems;
    }

}
