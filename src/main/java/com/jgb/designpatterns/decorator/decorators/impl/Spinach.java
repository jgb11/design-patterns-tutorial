package com.jgb.designpatterns.decorator.decorators.impl;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.decorators.PizzaDecorator;

public class Spinach extends PizzaDecorator {

    private final Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach (7.92)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 7.92;
    }

}
