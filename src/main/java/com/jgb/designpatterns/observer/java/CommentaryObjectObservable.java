package com.jgb.designpatterns.observer.java;

import com.jgb.designpatterns.observer.Commentary;

import java.util.Observable;

/**
 * @author jgb
 * @since 9/17/17 11:57 AM
 */
public class CommentaryObjectObservable extends Observable implements Commentary {
    private final String subjectDetails;

    public CommentaryObjectObservable(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setMessage(String message) {
        setChanged();
        notifyObservers(message);
    }

    public String subjectDetails() {
        return subjectDetails;
    }
}
