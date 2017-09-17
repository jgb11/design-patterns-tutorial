package com.jgb.designpatterns.observer.impl;

import com.jgb.designpatterns.observer.Observer;
import com.jgb.designpatterns.observer.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jgb
 * @since 9/16/17 1:53 PM
 */
public class SMSUser implements Observer {

    private static final Logger LOG = LogManager.getLogger(SMSUser.class);

    private String message;
    private String userInfo;

    public SMSUser(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    private void display() {
        LOG.info("[" + userInfo + "]: " + message);
    }

    @Override
    public void subscribe(Subject subject) {
        LOG.info("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        subject.subscribeObserver(this);
        LOG.info("Subscribed successfully.");
    }

    @Override
    public void unSubscribe(Subject subject) {
        LOG.info("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        subject.unSubscribeObserver(this);
        LOG.info("Unsubscribed successfully.");
    }
}
