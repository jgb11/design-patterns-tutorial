package com.jgb.designpatterns.composite;

import java.util.List;

/**
 * @author txoppe
 * @since 03/09/2017 | 11:40
 */
public abstract class HtmlTag {

    private static final String OPERATION_NOT_SUPPORTED = "Current operation is not support for this object";

    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public abstract String generateHtml();

}
