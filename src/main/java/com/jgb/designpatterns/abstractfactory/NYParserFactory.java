package com.jgb.designpatterns.abstractfactory;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.NYErrorXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.NYFeedbackXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.NYOrderXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.NYResponseXMLParser;

public class NYParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        switch (parserType) {
            case "NYERROR":
                return new NYErrorXMLParser();
            case "NYFEEDBACK":
                return new NYFeedbackXMLParser();
            case "NYORDER":
                return new NYOrderXMLParser();
            case "NYRESPONSE":
                return new NYResponseXMLParser();
            default:
                return null;
        }
    }

}
