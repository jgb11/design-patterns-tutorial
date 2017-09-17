package com.jgb.designpatterns.mediator.colleague;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 2:01 PM
 */

public class SoilRemoval {

    private static final Logger LOG = LogManager.getLogger(SoilRemoval.class);

    public void low() {
        LOG.info("Setting Soil Removal to low");
    }

    public void medium() {
        LOG.info("Setting Soil Removal to medium");
    }

    public void high() {
        LOG.info("Setting Soil Removal to high");
    }
}
