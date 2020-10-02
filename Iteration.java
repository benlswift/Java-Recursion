package com.company;

public class Iteration {
    public void factorialIterative(int num){
        int outputValue = num;
        int lastNum = 0;
        System.out.println(num +"!");
        for(int i=num; i> 1; i--){
            lastNum=i-1;
            outputValue*=lastNum;
            System.out.println(outputValue);
        }
    }
}
