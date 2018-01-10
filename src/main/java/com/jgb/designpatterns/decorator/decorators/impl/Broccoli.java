package com.jgb.designpatterns.decorator.decorators.impl;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.decorators.PizzaDecorator;

public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Broccoli (9.25)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }

}