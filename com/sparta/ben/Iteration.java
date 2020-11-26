package com.sparta.ben;

public class Iteration {
    public void factorialIterative(int num){
        int outputValue = num;
        int lastNum = 0;
        Printer.printMessage("---Iterative Recursion---\n"+num +"!");

        for(int i=num; i> 1; i--){
            lastNum=i-1;
            outputValue*=lastNum;
            Printer.printMessage(outputValue);
        }
    }
}
