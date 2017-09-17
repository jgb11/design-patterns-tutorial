package com.jgb.designpatterns.mediator;

/**
 * @author jgb
 * @since 9/17/17 1:39 PM
 */
public interface MachineMediator {

    void start();

    void wash();

    void open();

    void closed();

    void on();

    void off();

    boolean checkTemperature(int temp);

}