package com.han.orderservice.controller;


import com.han.orderservice.model.dish.DishType;
import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.emulator.DishInitializator;
import com.han.orderservice.model.json.HanadaConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @RequestMapping(value = "/getJsonList", method = RequestMethod.GET)
    @ResponseBody
    public String ajaxTest() {

        String json = DishInitializator.getJson();


        return json;
    }

    /**
     * Second thing we need to do is to use '@ResponseBody' annotation against the controller's method.
     * This will make spring understand that method return value should be bound to the web response body.
     */
//    @RequestMapping("dish")
//    public @ResponseBody
//    Product getStudent() {
//        return new Product(2, "Lagman", 80.00, 180, 15, DishType.FOOD);
//    }
//
//    @RequestMapping("dishlist")
//    public @ResponseBody
//    List<Product> getStudentList() {
//
//        List<Product> productList = DishInitializator.getDishList();
//        return productList;
//    }
}
