package com.jgb.designpatterns.decorator.decorators.impl;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.decorators.PizzaDecorator;

public class RedOnions extends PizzaDecorator {

    private final Pizza pizza;

    public RedOnions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Red Onions (3.75)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.75;
    }

}
