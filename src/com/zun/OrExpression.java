package com.zun;

public class OrExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context ctx) {
        return expr1.interpret(ctx) || expr2.interpret(ctx);
    }
}

class AndExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context ctx) {
        return expr1.interpret(ctx) || expr2.interpret(ctx);
    }
}


