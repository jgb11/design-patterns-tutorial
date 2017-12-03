package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TWOrderXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(TWOrderXMLParser.class);

    @Override
    public String parse() {
        LOG.info("TW Parsing order XML...");
        return "TW Order XML Message";
    }

}

