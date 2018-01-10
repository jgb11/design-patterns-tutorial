package com.jgb.designpatterns.decorator.decorators.impl;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.decorators.PizzaDecorator;

public class Ham extends PizzaDecorator {

    private final Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham (18.12)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 18.12;
    }

}