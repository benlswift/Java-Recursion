package com.company;

public class Main {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        Iteration iteration = new Iteration();
        Fibonacci fibonacci = new Fibonacci();

        fibonacci.startFibonacci(0,1,10);
        System.out.println("\n---Factorial Recursion---\n" + recursion.factorialRecursion(5));

        System.out.println("---Head recursion---");
        recursion.headRec(5);
        System.out.println("---Tail recursion---");
        recursion.tailRec(5);

        iteration.factorialIterative(5);

    }
    //fibonacci recursion
    //factorial recursion
    //head & tail recursion
    //push to GitHub -> send link to Astha
    //Iterative factorial
}
