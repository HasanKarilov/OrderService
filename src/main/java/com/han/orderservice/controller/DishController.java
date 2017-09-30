package com.han.orderservice.controller;

import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.emulator.DishInitializator;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DishController {
    @Autowired
    private DishInitializator dishInitializator;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDishes(Model model){
        List<Product> salads = new ArrayList<Product>();
        List<Product> foods = new ArrayList<Product>();
        List<Product> drinks = new ArrayList<Product>();

        for(Product product: DishInitializator.getDishList()){
            switch (product.getType()){
                case SALAD: salads.add(product); break;
                case FOOD: foods.add(product); break;
                case DRINK: drinks.add(product); break;
                default:  break;
            }
        }

        model.addAttribute("saladList", salads);
        model.addAttribute("dishList", foods);
        model.addAttribute("drinkList", drinks);

        return "dish";
    }

}
