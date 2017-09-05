package com.jgb.designpatterns.singleton;

/**
 * @author txoppe
 * @since 05/09/2017 | 16:24
 */
public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;

    private SingletonLazyMultithreaded() {
    }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        return sc == null ? new SingletonLazyMultithreaded() : sc;
    }
}
