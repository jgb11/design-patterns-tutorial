package com.jgb.designpatterns.bridge.implementer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author txoppe
 * @since 05/09/2017 | 15:44
 */
public class CentralLocking implements Product {

    private static final Logger LOG = LogManager.getLogger(CentralLocking.class);

    private final String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        LOG.info("Producing Central Locking System");
    }

}
