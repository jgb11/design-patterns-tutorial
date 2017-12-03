package com.jgb.designpatterns.abstractfactory;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.TWErrorXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.TWFeedbackXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.TWOrderXMLParser;
import com.jgb.designpatterns.abstractfactory.parser.impl.TWResponseXMLParser;

public class TWParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        switch (parserType) {
            case "TWERROR":
                return new TWErrorXMLParser();
            case "TWFEEDBACK":
                return new TWFeedbackXMLParser();
            case "TWORDER":
                return new TWOrderXMLParser();
            case "TWRESPONSE":
                return new TWResponseXMLParser();
            default:
                return null;
        }
    }

}
