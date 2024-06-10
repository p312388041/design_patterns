package com.chong.designs.interpreter;

public class DivExpression extends AbstractExpression {
    public DivExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        int result = left.interpret() / right.interpret();
        return result;
    }
}
