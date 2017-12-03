package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NYFeedbackXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(NYFeedbackXMLParser.class);

    @Override
    public String parse() {
        LOG.info("NY Parsing feedback XML...");
        return "NY Feedback XML Message";
    }

}

