package com.company;

public class Recursion {

    public int factorialRecursion(int num){
        if(num ==1 ){
            return 1;
        }
        int outputValue = 1;
        outputValue=num*factorialRecursion(num-1);//multiply last number by next number, recursively
        return outputValue;
    }

    //Head and Tail recursive factorials
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
        return num*tailFactorial(num-1);//count down from n
    }

    public int tailRec(int num){
        if (num==0){
            return 0;
        }
        System.out.println(num);
        return tailRec(num-1);
    }

    //basic head & tail recursions


    public void headRec(int num){

        if (num!=0){//stop at 0
            headRec(num-1);
        }
        else{
            return;
        }
        System.out.println(num);
    }
}


