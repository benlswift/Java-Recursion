package com.sparta.ben;

public class Starter {
    public void start(){
        Recursion recursion = new Recursion();
        Iteration iteration = new Iteration();
        Fibonacci fibonacci = new Fibonacci();

        fibonacci.startFibonacci(0,1,10);
        Printer.printMessage("\n---Factorial Recursion---\n"
                + recursion.factorialRecursion(5));

        Printer.printMessage("---Head recursion---");
        recursion.headRecursion(5);
        Printer.printMessage("---Tail recursion---");
        recursion.tailRecursion(5);

        iteration.factorialIterative(5);
    }
}
