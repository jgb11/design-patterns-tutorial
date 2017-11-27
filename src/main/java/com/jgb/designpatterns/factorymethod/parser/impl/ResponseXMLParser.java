package com.jgb.designpatterns.factorymethod.parser.impl;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResponseXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(ResponseXMLParser.class);

    @Override
    public String parse() {
        LOG.info("Parsing response XML...");
        return "Response XML Message";
    }

}
