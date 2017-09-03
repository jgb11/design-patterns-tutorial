package com.jgb.designpatterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author txoppe
 * @since 03/09/2017 | 11:45
 */
public class HtmlElement extends HtmlTag {

    private static final Logger LOG = LogManager.getLogger(HtmlElement.class);

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public String generateHtml() {
        LOG.info(startTag + tagBody + endTag);
        return startTag + tagBody + endTag;
    }

}
