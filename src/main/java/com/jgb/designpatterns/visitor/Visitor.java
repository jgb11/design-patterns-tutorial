package com.jgb.designpatterns.visitor;

import com.jgb.designpatterns.visitor.elements.HtmlElement;
import com.jgb.designpatterns.visitor.elements.HtmlParentElement;

public interface Visitor {
    void visit(HtmlElement element);

    void visit(HtmlParentElement parentElement);
}
