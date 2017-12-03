package com.jgb.designpatterns.abstractfactory.parser.impl;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NYOrderXMLParser implements XMLParser {

	private static final Logger LOG = LogManager.getLogger(NYOrderXMLParser.class);

	@Override
	public String parse() {
		LOG.info("NY Parsing order XML...");
		return "NY Order XML Message";
	}

}

