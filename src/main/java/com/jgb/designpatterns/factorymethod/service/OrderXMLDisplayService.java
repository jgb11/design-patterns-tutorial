package com.jgb.designpatterns.factorymethod.service;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import com.jgb.designpatterns.factorymethod.parser.impl.OrderXMLParser;

public class OrderXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }

}
