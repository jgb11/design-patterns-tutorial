package com.jgb.designpatterns.bridge.abstraction;

import com.jgb.designpatterns.bridge.implementer.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author txoppe
 * @since 05/09/2017 | 15:51
 */

public class Motoren extends Car {

    private static final Logger LOG = LogManager.getLogger(Motoren.class);

    public Motoren(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        LOG.info("Assembling " + product.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        LOG.info("Modifying product " + product.productName() + " according to " + carType);
    }

}
