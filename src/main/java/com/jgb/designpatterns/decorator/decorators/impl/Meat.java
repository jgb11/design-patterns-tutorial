package com.jgb.designpatterns.decorator.decorators.impl;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.decorators.PizzaDecorator;

public class Meat extends PizzaDecorator {

    private final Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Meat (14.25)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 14.25;
    }

}