package com.jgb.designpatterns.visitor.elements;

import com.jgb.designpatterns.visitor.Visitor;

public interface Element {

    void accept(Visitor visitor);
}
