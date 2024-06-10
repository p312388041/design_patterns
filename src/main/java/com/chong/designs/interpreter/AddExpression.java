package com.chong.designs.interpreter;

public class AddExpression extends AbstractExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        int result = left.interpret() + right.interpret();
        return result;
    }
}
