package com.company.JavaFundamentals;

public class Task7 {

    public double[] sortShell(double[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i--;
            }
        }
        return array;
    }
}
