package com.zun;

import java.awt.*;

public interface IMovieFactory {

    HollyWoodMovie getHollyWoodMovie();
    BollyWoodMovie getBollyWoodMovie();

}

class ActionMovieFactory implements IMovieFactory {
    @Override
    public HollyWoodMovie getHollyWoodMovie() {
        return new HollyWoodAction();
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie() {
        return new BollyWoodAction();
    }
}

class ComedyMovieFactory implements IMovieFactory {
    @Override
    public HollyWoodMovie getHollyWoodMovie() {
        return new HollyWoodComedy();
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie() {
        return new BollyWoodComedy();
    }
}
