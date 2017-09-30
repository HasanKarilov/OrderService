package com.han.orderservice.model;

import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.emulator.DishInitializator;

import java.util.List;


public class ProductTest {
    public static void main(String[] args) {
        List<Product> dishList = DishInitializator.getDishList();

        for(Product product: dishList){
            System.out.println(product.getDescription() + " " + product.getCost());
        }

    }
}
