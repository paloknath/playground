package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10, b = 5;

        System.out.println("Sum: " + calculator.add(a, b));
        System.out.println("Difference: " + calculator.subtract(a, b));
        System.out.println("Product: " + calculator.multiply(a, b));
        System.out.println("Quotient: " + calculator.divide(a, b));
    }
}