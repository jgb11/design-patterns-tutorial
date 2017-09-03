package com.jgb.designpatterns.composite;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author txoppe
 * @since 03/09/2017 | 11:53
 */
public class HtmlTagTest {

    @Test
    public void compositeTest() throws Exception {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);

        HtmlTag child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);

        final String html = parentTag.generateHtml();

        assertTrue("html must contains html tag", html.contains("<html>") && html.contains("</html>"));
        assertTrue("html must contains body tag", html.contains("<body>") && html.contains("</body>"));
        assertTrue("html must contains p tag", html.contains("<p>") && html.contains("</p>"));
    }
}