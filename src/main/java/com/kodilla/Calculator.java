package com.kodilla;

public class Calculator {

   int a = 10;
   int b = 5;
   int result;

    public void add() {
        result = a + b;
        System.out.println("Add result is: " + result);
    }

    public void substract() {
        result = a - b;
        System.out.println("Substract result is: " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.substract();
    }
}
