package com.jgb.designpatterns.observer;

/**
 * @author jgb
 * @since 9/16/17 1:49 PM
 */

public interface Observer {

    void update(String message);
    void subscribe(Subject subject);
    void unSubscribe(Subject subject);
}
