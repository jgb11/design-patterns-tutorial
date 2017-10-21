package com.jgb.designpatterns.mediator.colleague.impl;

import com.jgb.designpatterns.mediator.colleague.Colleague;
import com.jgb.designpatterns.mediator.mediatorcomponent.MachineMediator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/17/17 1:40 PM
 */
public class Button implements Colleague {

    private static final Logger LOG = LogManager.getLogger(Button.class);

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        LOG.info("Button pressed.");
        mediator.start();
    }

}
