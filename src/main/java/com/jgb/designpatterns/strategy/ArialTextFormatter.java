package com.jgb.designpatterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArialTextFormatter implements TextFormatter {

    private static final Logger LOG = LogManager.getLogger(ArialTextFormatter.class);

    @Override
    public void format(String text) {
        LOG.info("[ArialTextFormatter]: " + text);
    }

}
