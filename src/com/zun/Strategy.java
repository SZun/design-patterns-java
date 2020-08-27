package com.zun;

public interface Strategy {

    int performOperation(int num1, int num2);

}

class Add implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class Substract implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiply implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class Divide implements Strategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 / num2;
    }
}
