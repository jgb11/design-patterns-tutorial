package com.jgb.designpatterns.mediator.colleague.impl;

import com.jgb.designpatterns.mediator.colleague.Colleague;
import com.jgb.designpatterns.mediator.mediatorcomponent.MachineMediator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 1:56 PM
 */
public class Valve implements Colleague {

    private static final Logger LOG = LogManager.getLogger(Valve.class);

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void open() {
        LOG.info("Valve is opened...");
        LOG.info("Filling water...");
        mediator.closed();
    }

    public void closed() {
        LOG.info("Valve is closed...");
        mediator.on();
    }
}
