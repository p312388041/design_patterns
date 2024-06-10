package com.chong.designs.interpreter;

public class MulExpression extends AbstractExpression {
    public MulExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        int result = left.interpret() * right.interpret();
        return result;
    }
}
