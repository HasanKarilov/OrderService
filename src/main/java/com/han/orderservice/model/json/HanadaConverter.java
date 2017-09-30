package com.han.orderservice.model.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.han.orderservice.model.dish.Product;
import com.han.orderservice.model.emulator.DishInitializator;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class HanadaConverter {

//    public static void toJSON(Product product) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(new File(baseFile), product);
//        System.out.println("json created!");
//    }
//
//    public static Product toJavaObject() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(new File(baseFile), Product.class);
//    }

    public static String toJSON(Product product) throws IOException {
        //писать результат сериализации будем во Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();

        // сама сериализация: 1-куда, 2-что
        mapper.writeValue(writer, product);

        //преобразовываем все записанное во StringWriter в строку
        return writer.toString();
    }

    public static String objectToJson(Object obj) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = mapper.writeValueAsString(obj);
        return jsonObject;
    }

    public static Object jsonToObject(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Object obj = mapper.readValue(json, Product.class);
        return obj;
    }

    public static String listAsJson(){
        List<String> stringList = new ArrayList<String>();
        for (Product product : DishInitializator.getDishList()) {
            try {
                stringList.add(HanadaConverter.toJSON(product));
            } catch (IOException e) {

            }
        }
        return String.valueOf(stringList);
    }

}