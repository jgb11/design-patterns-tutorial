package com.jgb.designpatterns.observer.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Observable;

/**
 * @author jgb
 * @since 9/17/17 11:59 AM
 */
public class SMSUserObserver implements java.util.Observer {

    private static final Logger LOG = LogManager.getLogger(SMSUserObserver.class);

    private final String userInfo;
    private String message;

    public SMSUserObserver(String userInfo) {
        this.userInfo = userInfo;
    }

    public void subscribe(Observable observable) {
        LOG.info("Subscribing " + userInfo + " to " + ((CommentaryObjectObservable) (observable)).subjectDetails() + " ...");
        observable.addObserver(this);
        LOG.info("Subscribed successfully.");
    }

    public void unSubscribe(Observable observable) {
        LOG.info("Unsubscribing " + userInfo + " to " + ((CommentaryObjectObservable) (observable)).subjectDetails() + " ...");
        observable.deleteObserver(this);
        LOG.info("Unsubscribed successfully.");
    }

    @Override
    public void update(Observable o, Object arg) {
        message = (String) arg;
        display();
    }

    private void display() {
        LOG.info("[" + userInfo + "]: " + message);
    }

}
