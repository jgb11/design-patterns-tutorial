package com.jgb.designpatterns.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoboticOff implements RoboticState {

    private static final Logger LOG = LogManager.getLogger(RoboticCook.class);

    private final Robot robot;

    public RoboticOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        LOG.info("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        LOG.info("Cannot cook at Off state.");
    }

    @Override
    public void off() {
        LOG.info("Already switched off...");
    }
}
