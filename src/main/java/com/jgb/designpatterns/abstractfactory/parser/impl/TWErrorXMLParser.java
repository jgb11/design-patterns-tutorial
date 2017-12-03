package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TWErrorXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(TWErrorXMLParser.class);

    @Override
    public String parse() {
        LOG.info("TW Parsing error XML...");
        return "TW Error XML Message";
    }

}
