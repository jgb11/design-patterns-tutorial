package com.jgb.designpatterns.interpreter;

import com.jgb.designpatterns.interpreter.expressions.Expression;
import com.jgb.designpatterns.interpreter.expressions.impl.Number;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author jgb
 * @since 05/01/2018 17:38
 */
public class Interpreter {
    public int parse(String expression) {
        final Deque<Expression> stack = new ArrayDeque<>();
        final String[] tokenArray = expression.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                final Expression rightExpression = stack.pop();
                final Expression leftExpression = stack.pop();
                final Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                final int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                final Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        return stack.pop().interpret();
    }
}
