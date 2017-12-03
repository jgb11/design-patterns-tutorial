package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NYErrorXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(NYErrorXMLParser.class);

    @Override
    public String parse() {
        LOG.info("NY Parsing error XML...");
        return "NY Error XML Message";
    }

}
