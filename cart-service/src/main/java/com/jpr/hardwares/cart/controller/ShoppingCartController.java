package com.jpr.hardwares.cart.controller;

import com.jpr.hardwares.cart.model.Items;
import com.jpr.hardwares.cart.service.ShoppingCartServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/jpr/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartServiceImpl shoppingCartService;

    @GetMapping("/details")
    public List<Items> getCartDetails(){
        List<Items> items=shoppingCartService.getAllCartItems();
        log.info("getting product itmes via cart servvice "+items.toString());
        return items;
    }

    @PostMapping("/items")
    public List<Items>  saveCartItems(@RequestAttribute List<Items>  item){
        List<Items>  itemsList=shoppingCartService.saveCartItem(item);

        return itemsList;
    }
}
