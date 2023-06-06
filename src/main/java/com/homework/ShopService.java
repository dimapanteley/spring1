package com.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
//@Scope(scopeName = "prototype")

public class ShopService {
    private ShoppingCart shoppingCart;
//    private Product product;

    public ShopService(ShoppingCart shoppingCart/*, Product product*/) {
        this.shoppingCart = shoppingCart;
//        this.product = product;
    }

    public void add(String name, Integer price) {
        Product product = new Product(name, price);
        shoppingCart.getChart().put(product.getId(), product);
    }

    public String get() {        return shoppingCart.getChart().toString();
    }
}