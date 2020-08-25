package com.zun;

public interface HollyWoodMovie {

    String getName();

}

class HollyWoodAction implements HollyWoodMovie {

    @Override
    public String getName() {
        return "True lies is a hollywood action movie";
    }
}

class HollyWoodComedy implements HollyWoodMovie {

    @Override
    public String getName() {
        return "The jerk is a hollywood comedy movie";
    }
}


