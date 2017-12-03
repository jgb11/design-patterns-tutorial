package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NYResponseXMLParser implements XMLParser {

    private static final Logger LOG = LogManager.getLogger(NYResponseXMLParser.class);

    @Override
    public String parse() {
        LOG.info("NY Parsing response XML...");
        return "NY Response XML Message";
    }

}
