package com.jgb.designpatterns.abstractfactory;

import com.jgb.designpatterns.abstractfactory.parser.XMLParser;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * @author jgb
 * @since 03/12/2017 19:27
 */
public class ParserFactoryTest {

    @Test
    public void testGetParserInstance() throws Exception {

        final AbstractParserFactory nyParserFactory = ParserFactoryProducer.getFactory("NYFactory");
        assertThat("Must be of correct class type", nyParserFactory, instanceOf(NYParserFactory.class));
        assertNotNull("ParserFactory must not be null", nyParserFactory);
        final XMLParser nyParser = nyParserFactory.getParserInstance("NYORDER");
        assertThat("Must be of correct class type", nyParserFactory, instanceOf(NYParserFactory.class));
        System.out.println(nyParser.parse());

        System.out.println("************************************");

        final AbstractParserFactory twParserFactory = ParserFactoryProducer.getFactory("TWFactory");
        assertThat("Must be of correct class type", twParserFactory, instanceOf(TWParserFactory.class));
        assertNotNull("ParserFactory must not be null", twParserFactory);
        final XMLParser twParser = twParserFactory.getParserInstance("TWFEEDBACK");
        assertThat("Must be of correct class type", nyParserFactory, instanceOf(NYParserFactory.class));
        System.out.println(twParser.parse());
    }

}