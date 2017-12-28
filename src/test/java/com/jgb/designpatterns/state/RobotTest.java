package com.jgb.designpatterns.state;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * @author jgb
 * @since 28/12/17 12:55
 */
public class RobotTest {

    private Robot robot;

    @Before
    public void setUp() throws Exception {
        robot = new Robot();
    }

    @Test
    public void testStatePattern() {

        assertThat("State must be On", robot.getState(), instanceOf(RoboticOn.class));
        robot.walk();
        assertThat("State must be Standby", robot.getState(), instanceOf(RoboticStandby.class));
        robot.cook();
        assertThat("State must be Standby", robot.getState(), instanceOf(RoboticStandby.class));
        robot.walk();
        assertThat("State must be Standby", robot.getState(), instanceOf(RoboticStandby.class));
        robot.off();
        assertThat("State must be Off", robot.getState(), instanceOf(RoboticOff.class));

        robot.walk();
        assertThat("State must be Standby", robot.getState(), instanceOf(RoboticStandby.class));
        robot.off();
        assertThat("State must be Off", robot.getState(), instanceOf(RoboticOff.class));
        robot.cook();
        assertThat("State must be Standby", robot.getState(), instanceOf(RoboticStandby.class));
    }
}