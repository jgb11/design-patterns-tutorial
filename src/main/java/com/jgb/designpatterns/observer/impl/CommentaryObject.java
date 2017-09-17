package com.jgb.designpatterns.observer.impl;

import com.jgb.designpatterns.observer.Commentary;
import com.jgb.designpatterns.observer.Observer;
import com.jgb.designpatterns.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jgb
 * @since 9/16/17 1:51 PM
 */
public class CommentaryObject implements Subject, Commentary {

    private final List<Observer> observers;
    private final String subjectDetails;
    private String message;

    public CommentaryObject(String subjectDetails) {
        this.observers = new ArrayList<>();
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }

}
