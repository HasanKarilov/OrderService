package com.han.orderservice.model;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.han.orderservice.model.json.HanadaConverter;

/**
 * Created by hanaria on 9/30/17.
 */
public class JsonConverterTest {
    public static void main(String[] args) throws JsonProcessingException {

        String products = HanadaConverter.listAsJson();

        System.out.println(products);
//        ObjectMapper objectMapper = new ObjectMapper();
//        //Set pretty printing of json
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        //Define map which will be converted to JSON
//        List<Product> personList = DishInitializator.getDishList();
//
//        //1. Convert List of Person objects to JSON
//        String arrayToJson = objectMapper.writeValueAsString(personList);
//        System.out.println("1. Convert List of person objects to JSON :");
//        System.out.println(arrayToJson);
        //2. Convert JSON to List of Person objects
        //Define Custom Type reference for List<Person> type
//        TypeReference<List<Person>> mapType = new TypeReference<List<Person>>() {};
//        List<Person> jsonToPersonList = objectMapper.readValue(arrayToJson, mapType);
//        System.out.println("\n2. Convert JSON to List of person objects :");

        //Print list of person objects output using Java 8
//        jsonToPersonList.forEach(System.out::println)
    }
}
