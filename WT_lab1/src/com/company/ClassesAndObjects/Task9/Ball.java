package com.company.ClassesAndObjects.Task9;

public class Ball {

    private String color;
    private double weight;

    public Ball(String color, double weight) {
        this.color = color.toLowerCase();
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
