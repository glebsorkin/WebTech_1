package com.company;

import com.company.ClassesAndObjects.Task9.*;
import com.company.JavaFundamentals.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println("=======TASK 8\n" + Arrays.toString(
                task8.positions(new double[]{0, 1, 5, 7, 8}, new double[]{3, 6, 7})));
        Task2 task2 = new Task2();
        System.out.println("\n=======TASK 2\n" + task2.isContains(-6, -3));
        System.out.println(task2.isContains(-6, 0));
        System.out.println(task2.isContains(1, 7));
        Task4 task4 = new Task4();
        System.out.println("\n=======TASK 4");
        task4.findPrimaryNumbers(new int[]{0, -14, 1, 7, 21, 111, 10, 3, 19}, 9);
        Task6 task6 = new Task6();
        System.out.println("\n=======TASK 6");
        double[][] matrix = task6.createMatrix(1, 2, 3, 4, 5);
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%.2f ", doubles[j]);
            }
            System.out.println();
        }
        System.out.println("\n=======TASK 9");
        Ball ball1 = new Ball("blue", 0.2);
        Ball ball2 = new Ball("blue", 0.1);
        Ball ball3 = new Ball("red", 0.31);
        Ball ball4 = new Ball("green", 0.15);
        Ball ball5 = new Ball("yellow", 0.5);
        ArrayList<Ball> balls = new ArrayList<Ball>();
        Basket basket = new Basket(balls);
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);
        System.out.println(basket.getAmountOfColor("red"));
        System.out.println(basket.getAmountOfColor("blue"));
        System.out.println(basket.getAmountOfBlueColor());
        System.out.printf("%.3f\n", basket.getWeight());
        System.out.println("\n=======TASK 5");
        Task5 task5 = new Task5();
        System.out.println(task5.findK(new int[]{0, 1, 1, 7, 2, 5, 3, 4, 5}));
        System.out.println(task5.findK(new int[]{-1, 1, 2, 3, 4, 5, 10, 20, 100}));
        System.out.println(task5.findK(new int[]{10, 7, 2, 0, -13}));
    }
}
