package com.jgb.designpatterns.mediator.colleague.impl;

import com.jgb.designpatterns.mediator.colleague.Colleague;
import com.jgb.designpatterns.mediator.mediatorcomponent.MachineMediator;

/**
 * @author jgb
 * @since 9/17/17 1:42 PM
 */
public class Machine implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void start() {
        mediator.open();
    }

    public void wash() {
        mediator.wash();
    }
}
