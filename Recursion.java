package com.company;

public class Recursion {
    //recursive Fibonacci
    public void recFibonacci(int startNum, int second, int endNum){
        Printer print = new Printer();
        startFibonacci(startNum,second);
        int out = startNum+second;
        print.fibonacciPrint(out);
        if (out < endNum)
        {
            recFibonacci(second, out, endNum);
        }
    }

    public void startFibonacci(int startNum, int secondNum){
        Printer print = new Printer();
        if (startNum ==0 && secondNum ==0) {
            print.fibonacciPrint(startNum);
            print.fibonacciPrint(secondNum);
        }
    }

    public int factorialRecursion(int num){
        if(num ==1 ){
            return 1;
        }
        int outputValue = 1;
        outputValue=num*factorialRecursion(num-1);
        System.out.println(outputValue);
        return outputValue;

    }

    //Head and Tail recursive factorials
    public int headFactorial(int num){
        int outNum =0;
        if(num > 0){
            outNum = num*headFactorial(num-1);
            return outNum;
        }
        System.out.println(outNum);
        return 1;
    }

    public int tailRec(int num){
        if (num==0){
            return 0;
        }
        System.out.println(num);
        return tailRec(num-1);
    }
    public int tailFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num*tailFactorial(num-1);
    }

    public void headRec(int num){
        int outNum =0;
        if (num==0){
            return;
        }
        headRec(num-1);
        System.out.println(num);
    }
}


