package com.jgb.designpatterns.abstractfactory;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;

public interface AbstractParserFactory {

    XMLParser getParserInstance(String parserType);
}
