package com.jgb.designpatterns.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jgb
 * @since 05/01/2018 17:28
 */
public class ExpressionUtilsTest {

    private Interpreter interpreter;

    @Before
    public void setUp() {
        interpreter = new Interpreter();
    }

    @Test
    public void getInterpreterIs() {
        final String tokenString = "7 3 - 2 1 + *";
        final int result = interpreter.parse(tokenString);
        System.out.println("\n( " + tokenString + " ): " + result);
        assertEquals("Expression result must be (7 - 4) * (2 + 1)", 12, result);
    }
}