package com.jgb.designpatterns.mediator.colleague;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 2:02 PM
 */
public class Sensor {

    private static final Logger LOG = LogManager.getLogger(Sensor.class);

    public boolean checkTemperature(int temp) {
        LOG.info("Temperature reached " + temp + " *C");
        return true;
    }
}
