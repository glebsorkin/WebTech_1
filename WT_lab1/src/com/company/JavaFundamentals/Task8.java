package com.company.JavaFundamentals;

public class Task8 {

    public int[] positions(double[] arrayA, double[] arrayB) {
        int n = arrayA.length;
        int m = arrayB.length;
        int[] indexes = new int[m];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arrayA[i] >= arrayB[j]) {
                indexes[j] = i;
                j++;
            }
        }
        while (j < m) {
            indexes[j] = n;
            j++;
        }
        return indexes;
    }
}
