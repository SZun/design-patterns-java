package com.zun;

public interface BollyWoodMovie {

    String getName();

}

class BollyWoodAction implements BollyWoodMovie {

    @Override
    public String getName() {
        return "Bang Bang is a BollyWood action movie";
    }
}

class BollyWoodComedy implements BollyWoodMovie {

    @Override
    public String getName() {
        return "Munna Bhai MBBS is a BollyWood comedy movie";
    }
}
