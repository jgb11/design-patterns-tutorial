package com.jgb.designpatterns.singleton;

/**
 * @author txoppe
 * @since 05/09/2017 | 16:22
 */
public class SingletonEager {

    private static SingletonEager sc = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return sc;
    }
}
