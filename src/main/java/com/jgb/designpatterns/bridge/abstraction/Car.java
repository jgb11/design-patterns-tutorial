package com.jgb.designpatterns.bridge.abstraction;

import com.jgb.designpatterns.bridge.implementer.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author txoppe
 * @since 05/09/2017 | 15:47
 */
public abstract class Car {

    private static final Logger LOG = LogManager.getLogger(Car.class);

    final Product product;
    final String carType;

    Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        LOG.info("Car: " + carType + ", Product: " + product.productName());
    }
}
