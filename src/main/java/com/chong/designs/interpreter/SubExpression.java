package com.chong.designs.interpreter;

public class SubExpression extends AbstractExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        int result = left.interpret() - right.interpret();
        return result;
    }
}
