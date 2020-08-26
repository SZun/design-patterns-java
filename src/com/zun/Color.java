package com.zun;

interface Color {

    void fillWithColor(int border);

}

class Red implements Color{
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + "in\" border");
    }
}

class Green implements Color{
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + "in\" border");
    }
}






