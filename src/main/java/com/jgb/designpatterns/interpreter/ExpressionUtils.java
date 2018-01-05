package com.jgb.designpatterns.interpreter;

import com.jgb.designpatterns.interpreter.expressions.Expression;
import com.jgb.designpatterns.interpreter.expressions.impl.Add;
import com.jgb.designpatterns.interpreter.expressions.impl.Product;
import com.jgb.designpatterns.interpreter.expressions.impl.Substract;

public class ExpressionUtils {

    private ExpressionUtils() {
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Product(left, right);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
