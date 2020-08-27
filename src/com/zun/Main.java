package com.zun;

public class Main {

    private static InterpreterContext ic;

    private Main(InterpreterContext i){
        ic = i;
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Main ec = new Main(new InterpreterContext());
        System.out.println(str1+"= "+ec.interpret(str1));
        System.out.println(str2+"= "+ec.interpret(str2));
    }


    private static String interpret(String str) {
        Expression exp = null;

        // perform the parsing
        if(str.contains("Hexadecimal")){
            exp=new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else if(str.contains("Binary")) {
            exp=new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else
            return str;

        return exp.interpret(ic);
    }
}
