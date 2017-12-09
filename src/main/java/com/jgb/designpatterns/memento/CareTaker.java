package com.jgb.designpatterns.memento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private static final Logger LOG = LogManager.getLogger(CareTaker.class);

    private final Map<String, Memento> savepointStorage = new HashMap<>();

    public void saveMemento(Memento memento, String savepointName) {
        LOG.info("Saving state..." + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public Memento getMemento(String savepointName) {
        LOG.info("Undo at ..." + savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints() {
        LOG.info("Clearing all save points...");
        savepointStorage.clear();
    }
}
