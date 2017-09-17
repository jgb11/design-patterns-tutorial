package com.jgb.designpatterns.observer;

/**
 * @author jgb
 * @since 9/16/17 1:48 PM
 */

public interface Subject {

    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();
}
