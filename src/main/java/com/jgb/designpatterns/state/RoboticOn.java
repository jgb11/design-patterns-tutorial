package com.jgb.designpatterns.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoboticOn implements RoboticState {

    private static final Logger LOG = LogManager.getLogger(RoboticOn.class);

    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        LOG.info("Walking...");
    }

    @Override
    public void cook() {
        LOG.info("Cooking...");
        robot.setRoboticState(robot.getRoboticCook());
    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        LOG.info("Robot is switched off");
    }

}
