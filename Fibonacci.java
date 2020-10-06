package com.company;

public class Fibonacci {
    //recursive Fibonacci
    public void recursiveFibonacci(int start, int second, int count) {
        int output = 0;
        if (count > 0) {//until stopping criteria
            output = start + second;//add last 2 numbers together
            start = second;
            second = output;
            System.out.print(output+" ");
            recursiveFibonacci(start, second, count-1);//recursion
        }
    }

    public void startFibonacci(int startNum, int secondNum,int end){
        Printer print = new Printer();
        if (startNum ==0 && secondNum ==1) {//print out first Fibonacci number, 0
            System.out.println("---Fibonacci Sequence---");
            print.fibonacciPrint(startNum);
        }
        recursiveFibonacci(startNum,secondNum,end-1);

    }
}
