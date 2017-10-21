package com.jgb.designpatterns.mediator.colleague.impl;

import com.jgb.designpatterns.mediator.colleague.Colleague;
import com.jgb.designpatterns.mediator.mediatorcomponent.MachineMediator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 1:58 PM
 */
public class Heater implements Colleague {

    private static final Logger LOG = LogManager.getLogger(Heater.class);

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void on(int temp) {
        LOG.info("Heater is on...");
        if (mediator.checkTemperature(temp)) {
            LOG.info("Temperature is set to " + temp);
            mediator.off();
        }
    }

    public void off() {
        LOG.info("Heater is off...");
        mediator.wash();
    }
}
