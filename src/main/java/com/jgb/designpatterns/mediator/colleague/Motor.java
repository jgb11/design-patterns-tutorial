package com.jgb.designpatterns.mediator.colleague;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 2:01 PM
 */
public class Motor {

    private static final Logger LOG = LogManager.getLogger(Motor.class);

    public void startMotor() {
        LOG.info("Start motor...");
    }

    public void rotateDrum(int rpm) {
        LOG.info("Rotating drum at " + rpm + " rpm.");
    }
}
