package com.jgb.designpatterns.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoboticStandby implements RoboticState {

    private static final Logger LOG = LogManager.getLogger(RoboticStandby.class);

    private final Robot robot;

    public RoboticStandby(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        LOG.info("In standby state...");
        robot.setState(robot.getRoboticOn());
        LOG.info("Walking...");
    }

    @Override
    public void cook() {
        LOG.info("In standby state...");
        robot.setRoboticState(robot.getRoboticCook());
        LOG.info("Cooking...");
    }

    @Override
    public void off() {
        LOG.info("In standby state...");
        robot.setState(robot.getRoboticOff());
        LOG.info("Robot is switched off");

    }

}
