package com.jgb.designpatterns.builder.classbuilder;

/**
 * @author jgb
 * @since 25/11/2017 10:08
 */
public interface CarBuilder {

    void buildBodyStyle();

    void buildPower();

    void buildEngine();

    void buildBreaks();

    void buildSeats();

    void buildWindows();

    void buildFuelType();

    Car getCar();
}
