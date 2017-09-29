package com.han.orderservice.model.kitchen;

public class Cook
{
    public final String name;
    public Cook(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return name;
    }
}