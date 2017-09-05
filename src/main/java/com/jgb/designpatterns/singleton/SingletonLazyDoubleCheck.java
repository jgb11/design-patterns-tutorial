package com.jgb.designpatterns.singleton;

/**
 * @author txoppe
 * @since 05/09/2017 | 16:25
 */
public class SingletonLazyDoubleCheck {

    private static volatile SingletonLazyDoubleCheck sc = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (sc == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null) {
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
