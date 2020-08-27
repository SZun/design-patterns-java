package com.zun;

public interface Expression {

    String interpret(InterpreterContext ic);

}

class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinary(i);
    }
}

class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimal(i);
    }
}
