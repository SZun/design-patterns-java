package com.zun;

import java.awt.*;

public interface IMovieFactory {

    HollyWoodMovie getHollyWoodMovie(String type);
    BollyWoodMovie getBollyWoodMovie(String type);

}

class HollyWoodMovieFactory implements IMovieFactory {
    @Override
    public HollyWoodMovie getHollyWoodMovie(String type) {
        if(type == null) return null;
        else if (type.equalsIgnoreCase("COMEDY")) return new HollyWoodComedy();
        else if (type.equalsIgnoreCase("ACTION")) return new HollyWoodAction();
        return null;
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie(String type) {
        return null;
    }
}

class BollyWoodMovieFactory implements IMovieFactory {
    @Override
    public HollyWoodMovie getHollyWoodMovie(String type) {
        return null;
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie(String type) {
        if(type == null) return null;
        else if (type.equalsIgnoreCase("COMEDY")) return new BollyWoodComedy();
        else if (type.equalsIgnoreCase("ACTION")) return new BollyWoodAction();
        return null;
    }
}
