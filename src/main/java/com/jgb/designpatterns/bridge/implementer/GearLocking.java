package com.jgb.designpatterns.bridge.implementer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author txoppe
 * @since 05/09/2017 | 15:45
 */
public class GearLocking implements Product {

    private static final Logger LOG = LogManager.getLogger(GearLocking.class);


    private final String productName;

    public GearLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        LOG.info("Producing Gear Locking System");
    }

}
