package com.jgb.designpatterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LowerTextFormatter implements TextFormatter {

    private static final Logger LOG = LogManager.getLogger(CapTextFormatter.class);

    @Override
    public void format(String text) {
        LOG.info("[LowerTextFormatter]: " + text.toLowerCase());
    }

}
