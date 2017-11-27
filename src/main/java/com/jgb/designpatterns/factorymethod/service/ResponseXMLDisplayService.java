package com.jgb.designpatterns.factorymethod.service;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import com.jgb.designpatterns.factorymethod.parser.impl.ResponseXMLParser;

public class ResponseXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }

}
