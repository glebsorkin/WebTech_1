package com.company.ClassesAndObjects.Task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }

    public double getWeight() {
        double weight = 0.0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getAmountOfColor(String color) {
        int amount = 0;
        color = color.toLowerCase();
        for (Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                amount++;
            }
        }
        return amount;
    }

    public int getAmountOfBlueColor() {
        int amount = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals("blue")) {
                amount++;
            }
        }
        return amount;
    }
}
