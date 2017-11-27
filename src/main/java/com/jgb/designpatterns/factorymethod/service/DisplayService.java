package com.jgb.designpatterns.factorymethod.service;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class DisplayService {

    private static final Logger LOG = LogManager.getLogger(DisplayService.class);

    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        LOG.info(msg);
    }

    protected abstract XMLParser getParser();

}
