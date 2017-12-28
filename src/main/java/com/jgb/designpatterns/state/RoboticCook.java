package com.jgb.designpatterns.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoboticCook implements RoboticState {

    private static final Logger LOG = LogManager.getLogger(RoboticCook.class);

    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        LOG.info("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        LOG.info("Cooking...");
    }

    @Override
    public void off() {
        LOG.info("Cannot switched off while cooking...");
    }
}
