package com.company.JavaFundamentals;

public class Task1 {

    private double calculateNumerator(double x, double y) {
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    private double calculateDenominator(double x, double y) {
        return 2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
    }

    private double calculateExpression(double x, double y) {
        return calculateNumerator(x, y) / calculateDenominator(x, y) + x;
    }
}
