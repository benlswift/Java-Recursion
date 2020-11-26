package com.sparta.ben;

public class Recursion {

    public int factorialRecursion(int num){
        if(num ==1 ){
            return 1;
        }
        int outputValue = 1;
        outputValue=num*factorialRecursion(num-1);
        return outputValue;
    }

    public int headFactorial(int num){
        int outNum =0;
        if(num > 0){
            outNum = num*headFactorial(num-1);
            return outNum;
        }
        return outNum;
    }

    public int tailFactorial(int num){
        if(num == 0){//stop when number is 0
            return 1;
        }
        return num*tailFactorial(num-1);
    }

    public int tailRecursion(int num){
        if (num==0){
            return 0;
        }
        Printer.printMessage(num);
        return tailRecursion(num-1);
    }


    public void headRecursion(int num){

        if (num!=0){//stop at 0
            headRecursion(num-1);
        }
        else{
            return;
        }
        Printer.printMessage(num);
    }
}


