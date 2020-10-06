package com.company;

public class Iteration {
    public void factorialIterative(int num){
        int outputValue = num;
        int lastNum = 0;
        System.out.println("---Iterative Recursion---\n"+num +"!");
        for(int i=num; i> 1; i--){//start with number entered
            lastNum=i-1;//work backwards
            outputValue*=lastNum;//multiply last two numbers together
            System.out.println(outputValue);//output result, move onto next two numbers
        }
    }
}
