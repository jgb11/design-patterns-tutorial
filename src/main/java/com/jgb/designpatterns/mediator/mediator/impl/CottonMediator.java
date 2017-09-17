package com.jgb.designpatterns.mediator.mediator.impl;

import com.jgb.designpatterns.mediator.colleague.Motor;
import com.jgb.designpatterns.mediator.colleague.Sensor;
import com.jgb.designpatterns.mediator.colleague.SoilRemoval;
import com.jgb.designpatterns.mediator.colleague.impl.Heater;
import com.jgb.designpatterns.mediator.colleague.impl.Machine;
import com.jgb.designpatterns.mediator.colleague.impl.Valve;
import com.jgb.designpatterns.mediator.mediator.MachineMediator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 2:00 PM
 */
public class CottonMediator implements MachineMediator {

    private static final Logger LOG = LogManager.getLogger(CottonMediator.class);

    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public CottonMediator(Machine machine, Heater heater, Motor motor, Sensor sensor, SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;

        LOG.info("## Setting up for COTTON program ##");
    }

    @Override
    public void start() {
        machine.start();
    }

    @Override
    public void wash() {
        motor.startMotor();
        motor.rotateDrum(700);
        LOG.info("Adding detergent");
        soilRemoval.low();
        LOG.info("Adding softener");
    }

    @Override
    public void open() {
        valve.open();
    }

    @Override
    public void closed() {
        valve.closed();
    }

    @Override
    public void on() {
        heater.on(40);
    }

    @Override
    public void off() {
        heater.off();
    }

    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }

}
