package com.chong.designs.interpreter;

public abstract class AbstractExpression implements Expression{
    protected Expression left;
    protected Expression right;
    public AbstractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }   
}
