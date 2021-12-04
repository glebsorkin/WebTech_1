package com.company.JavaFundamentals;

public class Task3 {

    public double[][] calculateTan(double a, double b, double h) {
        double[][] answer = new double[(int) ((b - a) / h)][2];
        for (int i = 0; i < answer.length; i++) {
            answer[i][0] = a;
            answer[i][1] = Math.tan(a);
            a += h;
        }
        return answer;
    }
}
