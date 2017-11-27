package com.jgb.designpatterns.factorymethod.service;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jgb
 * @since 27/11/2017 17:39
 */
public class DisplayServiceTest {

    private List<DisplayService> displayServiceList;

    @Before
    public void setUp() throws Exception {
        displayServiceList = Arrays.asList(
                new FeedbackXMLDisplayService(),
                new ErrorXMLDisplayService(),
                new OrderXMLDisplayService(),
                new ResponseXMLDisplayService()
        );
    }

    @Test
    public void display() throws Exception {
        this.displayServiceList.forEach(DisplayService::display);
    }

}