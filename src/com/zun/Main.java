package com.zun;

public class Main {

    public static void main(String[] args) {
        Expression male = getMaleExpression();
        Expression marriedWoman = getMarriedWomanExpression();

        Context ic = new Context("John");
        System.out.println("Is John male ?: " + male.interpret(ic));

        ic = new Context("Married Julie");
        System.out.println("Julie is a married woman?: " + marriedWoman.interpret(ic));

        ic = new Context("Lucy");
        System.out.println("Is Lucy male ?: " + male.interpret(ic));
    }

    private static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert,john);
    }

    private static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new OrExpression(julie,married);
    }

}
