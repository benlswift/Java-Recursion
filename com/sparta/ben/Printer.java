package com.sparta.ben;

public class Printer {
    public static void fibonacciPrint(int num){
        System.out.print(num + " ");
    }

    public static <T> void printMessage(T message){
        System.out.println(message);
    }
}
