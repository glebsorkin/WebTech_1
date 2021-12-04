package com.company.JavaFundamentals;


public class Task6 {

    public double[][] createMatrix(double... numbers) {
        int length = numbers.length;
        double[][] matrix = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = numbers[(i + j) % length];
            }
        }
        return matrix;
    }
}
