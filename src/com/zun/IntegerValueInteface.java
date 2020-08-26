package com.zun;

public interface IntegerValueInteface {

    int getInteger();

}

class IntegerValue implements IntegerValueInteface {

    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {

    private IntegerValueInteface myInt;

    public ObjectAdapter(IntegerValueInteface myInt) {
        this.myInt = myInt;
    }

    public int getInteger(){
        return 2 + myInt.getInteger();
    }
}