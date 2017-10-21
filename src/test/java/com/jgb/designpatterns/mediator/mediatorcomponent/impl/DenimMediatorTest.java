package com.jgb.designpatterns.mediator.mediatorcomponent.impl;

import com.jgb.designpatterns.mediator.colleague.Motor;
import com.jgb.designpatterns.mediator.colleague.Sensor;
import com.jgb.designpatterns.mediator.colleague.SoilRemoval;
import com.jgb.designpatterns.mediator.colleague.impl.Button;
import com.jgb.designpatterns.mediator.colleague.impl.Heater;
import com.jgb.designpatterns.mediator.colleague.impl.Machine;
import com.jgb.designpatterns.mediator.colleague.impl.Valve;
import com.jgb.designpatterns.mediator.mediatorcomponent.MachineMediator;
import org.junit.Test;

/**
 * @author jgb
 * @since 9/17/17 2:09 PM
 */
public class DenimMediatorTest {

    @Test
    public void testDenimMediator() throws Exception {
        MachineMediator mediator;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }

}