package com.zun;

public interface Expression {

    boolean interpret(Context ctx);

}

class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.getRes(data);
    }
}
