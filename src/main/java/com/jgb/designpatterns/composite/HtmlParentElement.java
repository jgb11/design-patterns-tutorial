package com.jgb.designpatterns.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author txoppe
 * @since 03/09/2017 | 11:41
 */
public class HtmlParentElement extends HtmlTag {

    private static final Logger LOG = LogManager.getLogger(HtmlParentElement.class);

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag>childrenTag;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(HtmlTag htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren(){
        return childrenTag;
    }

    @Override
    public String generateHtml() {
        StringBuilder completeHtml = new StringBuilder();
        LOG.info(startTag);
        completeHtml.append(startTag);
        childrenTag.forEach(tag -> completeHtml.append(tag.generateHtml()));
        LOG.info(endTag);
        completeHtml.append(endTag);
        return completeHtml.toString();
    }

}
