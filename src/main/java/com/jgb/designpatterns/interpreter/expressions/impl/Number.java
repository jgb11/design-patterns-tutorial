package com.jgb.designpatterns.interpreter.expressions.impl;

import com.jgb.designpatterns.interpreter.expressions.Expression;

public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }

}
