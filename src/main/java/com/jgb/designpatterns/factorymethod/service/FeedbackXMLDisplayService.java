package com.jgb.designpatterns.factorymethod.service;

import com.jgb.designpatterns.factorymethod.parser.XMLParser;
import com.jgb.designpatterns.factorymethod.parser.impl.FeedbackXMLParser;

public class FeedbackXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new FeedbackXMLParser();
    }

}