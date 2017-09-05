package com.jgb.designpatterns.singleton;

/**
 * @author txoppe
 * @since 05/09/2017 | 16:23
 */
public class SingletonLazy {
    private static SingletonLazy sc = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        return sc == null ? new SingletonLazy() : sc;
    }
}
