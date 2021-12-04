package com.company.JavaFundamentals;

public class Task4 {

    public void findPrimaryNumbers(int[] array, int N) {
        for (int i = 0; i < N; i++) {
            if (isPrimary(array[i])) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }

    private boolean isPrimary(int number) {
        if (number<1){
            return false;
        }
        double sqrtNumber = Math.sqrt(number);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
