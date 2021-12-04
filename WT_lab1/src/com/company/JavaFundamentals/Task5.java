package com.company.JavaFundamentals;

public class Task5 {

    public int findK(int[] array) {
        int k = 0;
        int n = array.length;
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && (lengths[j] + 1) > lengths[i]) {
                    lengths[i] = lengths[j] + 1;
                }
            }
        }
        int length = lengths[0];
        for (int i = 0; i < n; i++) {
            if (lengths[i] > length) {
                length = lengths[i];
            }
        }
        k = n - length;
        return k;
    }
}
