package com.company;

import com.hotmail.kalebmarc.jtools.Console;

public class Main {

    private static int RANGE = 5000;

    public static void main(String[] args) {
        double x, y;
        double validFirstNum;
        double validSecondNum;

        System.out.print("Adds to: ");
        x = Console.getValidDouble();//adds to

        System.out.println();
        System.out.println("Multiplies to: ");
        y = Console.getValidDouble();//mult to

        for (double i = -RANGE; i <= RANGE; i++){
            if(((y / i) + i) == x){
                validFirstNum = (y / i);
                validSecondNum = i;
                System.out.println(validFirstNum + "   " + validSecondNum);
                return;
            }
        }
        System.out.println("No solution found");
    }
}
