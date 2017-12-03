package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TWFeedbackXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(TWFeedbackXMLParser.class);

    @Override
    public String parse() {
        LOG.info("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }

}

