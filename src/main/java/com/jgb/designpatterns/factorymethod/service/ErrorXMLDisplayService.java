package com.jgb.designpatterns.factorymethod.service;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import com.jgb.designpatterns.factorymethod.parser.impl.ErrorXMLParser;

public class ErrorXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }

}
