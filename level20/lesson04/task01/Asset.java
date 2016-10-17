package com.javarush.test.level20.lesson04.task01;

import java.io.Serializable;
public class Asset implements Serializable
{
    public Asset(String name) {
        this.name = name;
    }
    private static final long serialVersionUID = 2L;
    private String name;
    private double price;
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
