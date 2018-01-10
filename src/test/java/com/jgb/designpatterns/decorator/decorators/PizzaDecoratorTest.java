package com.jgb.designpatterns.decorator.decorators;

import com.jgb.designpatterns.decorator.Pizza;
import com.jgb.designpatterns.decorator.SimplyNonVegPizza;
import com.jgb.designpatterns.decorator.SimplyVegPizza;
import com.jgb.designpatterns.decorator.decorators.impl.*;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author jgb
 * @since 10/01/2018 12:34
 */
public class PizzaDecoratorTest {

    @Test
    public void testGetDescWithDecoratorClasses() {
        final DecimalFormat dformat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();
        assertTrue("Pizza is just SimplyVegPizza (230)", pizza.getDesc().equals("SimplyVegPizza (230)"));
        pizza = new RomaTomatoes(pizza);
        assertTrue("Pizza is decorated with , Roma Tomatoes (5.20)", pizza.getDesc().equals("SimplyVegPizza (230), Roma Tomatoes (5.20)"));
        pizza = new GreenOlives(pizza);
        assertTrue("Pizza is decorated with , Green Olives (5.47)", pizza.getDesc().equals("SimplyVegPizza (230), Roma Tomatoes (5.20), Green Olives (5.47)"));
        pizza = new Spinach(pizza);
        assertTrue("Pizza is decorated with , Spinach (7.92)", pizza.getDesc().equals("SimplyVegPizza (230), Roma Tomatoes (5.20), Green Olives (5.47), Spinach (7.92)"));
        assertEquals("Pizza must cost 248.59", 248.59, pizza.getPrice(), 0.01);

        System.out.println("\nDesc: " + pizza.getDesc());
        System.out.println("\nPrice: " + dformat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        assertTrue("Pizza is just SimplyNonVegPizza (350)", pizza.getDesc().equals("SimplyNonVegPizza (350)"));
        pizza = new Meat(pizza);
        assertTrue("Pizza is decorated with , Meat (14.25)", pizza.getDesc().equals("SimplyNonVegPizza (350), Meat (14.25)"));
        pizza = new Cheese(pizza);
        assertTrue("Pizza is decorated with , Cheese (20.72)", pizza.getDesc().equals("SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72)"));
        pizza = new Cheese(pizza);
        assertTrue("Pizza is decorated with , Cheese (20.72)", pizza.getDesc().equals("SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72), Cheese (20.72)"));
        pizza = new Ham(pizza);
        assertTrue("Pizza is decorated with , Ham (18.12)", pizza.getDesc().equals("SimplyNonVegPizza (350), Meat (14.25), Cheese (20.72), Cheese (20.72), Ham (18.12)"));
        assertEquals("Pizza must cost 423.81", 423.81, pizza.getPrice(), 0.01);

        System.out.println("\nDesc: " + pizza.getDesc());
        System.out.println("\nPrice: " + dformat.format(pizza.getPrice()));
    }
}