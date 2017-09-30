package com.han.orderservice.model.emulator;

import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.dish.DishType;
import com.han.orderservice.model.json.HanadaConverter;
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
    public final static String json = "[{\"id\":1,\"description\":\"Plov\",\"cost\":90.0,\"quantity\":0,\"weight\":190,\"time\":15,\"type\":\"FOOD\"}, {\"id\":2,\"description\":\"Lagman\",\"cost\":80.0,\"quantity\":0,\"weight\":180,\"time\":15,\"type\":\"FOOD\"}, {\"id\":3,\"description\":\"Shorpo\",\"cost\":95.0,\"quantity\":0,\"weight\":210,\"time\":15,\"type\":\"FOOD\"}, {\"id\":11,\"description\":\"Vecho\",\"cost\":60.0,\"quantity\":0,\"weight\":100,\"time\":5,\"type\":\"SALAD\"}, {\"id\":12,\"description\":\"Imperator\",\"cost\":60.0,\"quantity\":0,\"weight\":100,\"time\":5,\"type\":\"SALAD\"}, {\"id\":13,\"description\":\"Olivie\",\"cost\":60.0,\"quantity\":0,\"weight\":100,\"time\":5,\"type\":\"SALAD\"}, {\"id\":21,\"description\":\"Viski\",\"cost\":55.0,\"quantity\":0,\"weight\":50,\"time\":2,\"type\":\"DRINK\"}, {\"id\":22,\"description\":\"Pivo\",\"cost\":40.0,\"quantity\":0,\"weight\":50,\"time\":2,\"type\":\"DRINK\"}, {\"id\":23,\"description\":\"Vodka\",\"cost\":45.0,\"quantity\":0,\"weight\":50,\"time\":2,\"type\":\"DRINK\"}]\n";

    public static List<Product> getDishList() {
        return dishList;
    }

    public static String getJson() {
        return json;
    }
}
