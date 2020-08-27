package com.zun;

public interface Observer {

    void update(int runs, int wickets, float overs);

}

class AverageScoreDisplay implements Observer {

    private float runRate;
    private int predictScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        runRate = runs/overs;
        predictScore = (int) runRate * 50;
        display();
    }

    public void display(){
        System.out.println(
                "\n Average Score Display\n" +
                "Run Rate: " + runRate +
                "\n Predicted Score: " + predictScore
        );
    }
}

class CurrentScoreDisplay implements Observer {

    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        display();
    }

    public void display(){
        System.out.println(
                "\nCurrent Score Display:\n" +
                "Runs: " + runs +
                "\nWickets: " + wickets +
                "\nOvers: " + overs
        );
    }
}