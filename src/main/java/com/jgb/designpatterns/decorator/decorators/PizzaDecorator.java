package com.jgb.designpatterns.decorator.decorators;

import com.jgb.designpatterns.decorator.Pizza;

public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDesc() {
        return "Toppings";
    }

}
