package com.han.orderservice.model.emulator;

import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.dish.DishType;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DishInitializator {
    public static List<Product> dishList = Arrays.asList(
            new Product(1, "Plov", 90.00, 190, 15, DishType.FOOD),
            new Product(2, "Lagman", 80.00, 180, 15, DishType.FOOD),
            new Product(3, "Shorpo", 95.00, 210, 15, DishType.FOOD),

            new Product(11, "Vecho", 60.00, 100, 5, DishType.SALAD),
            new Product(12, "Imperator", 60.00, 100, 5, DishType.SALAD),
            new Product(13, "Olivie", 60.00, 100, 5, DishType.SALAD),

            new Product(21, "Viski", 55.00, 50, 2, DishType.DRINK),
            new Product(22, "Pivo", 40.00, 50, 2, DishType.DRINK),
            new Product(23, "Vodka", 45.00, 50, 2, DishType.DRINK)


    );

    public static List<Product> getDishList() {
        return dishList;
    }
}
