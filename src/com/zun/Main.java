package com.zun;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        CricketData cricketData = new CricketData();

        Arrays.asList(averageScoreDisplay, currentScoreDisplay).forEach(cricketData::registerObserver);

        cricketData.dataChanged();

        cricketData.unregisterObserver(averageScoreDisplay);

        cricketData.dataChanged();
    }
}
