package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Item, Integer> cart = new HashMap<>();

    public Map<Item, Integer> getCart() {
        return cart;
    }
}
