package com.example;

public class Calculator {
    double hasil = 0.0;

    // Method to add two numbers
    public double add(double a, double b) {
        hasil = a + b;
        return hasil;
    }

    // Method to subtract one number from another
    public double subtract(double a, double b) {
        hasil = a - b;
        return hasil;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        hasil = a * b;
        return hasil;
    }

    // Method to divide one number by another
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
    public double divide5(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
    public double divide4(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
    public double divide3(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
    public double divide2(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
    public double divide1(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        hasil = a / b;
        return hasil;
    }
}
