package com.jgb.designpatterns.template;

import org.junit.Test;

/**
 * @author jgb
 * @since 11/12/17 18:11
 */
public class ConnectionTemplateTest {

    @Test
    public void testTemplatePattern() {

        System.out.println("For MYSQL....");
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();

        System.out.println("\nFor Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}