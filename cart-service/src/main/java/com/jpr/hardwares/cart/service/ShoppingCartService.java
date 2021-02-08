package com.jpr.hardwares.cart.service;

import com.jpr.hardwares.cart.model.Items;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public interface ShoppingCartService {

    public List<Items> getAllCartItems();
    public List<Items> saveCartItem(List<Items>  item);
}
