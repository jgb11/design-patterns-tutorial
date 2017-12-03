package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TWResponseXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(TWResponseXMLParser.class);

    @Override
    public String parse() {
        LOG.info("TW Parsing response XML...");
        return "TW Response XML Message";
    }

}
