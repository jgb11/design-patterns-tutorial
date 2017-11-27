package com.jgb.designpatterns.factorymethod.parser.impl;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ErrorXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(ErrorXMLParser.class);

    @Override
    public String parse() {
        LOG.info("Parsing error XML...");
        return "Error XML Message";
    }

}
