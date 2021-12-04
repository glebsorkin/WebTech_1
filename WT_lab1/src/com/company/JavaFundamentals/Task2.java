package com.company.JavaFundamentals;

public class Task2 {

    private final int yTop = 5;
    private final int yBottom = -3;

    private final int xTopLeft = -4;
    private final int xTopRight = 4;
    private final int xBottomLeft = -6;
    private final int xBottomRight = 6;

    public boolean isContains(double x, double y) {
        if (y <= yTop && y >= yBottom) {
            if (y > 0) {
                return x >= xTopLeft && x <= xTopRight;
            } else {
                return x >= xBottomLeft && x <= xBottomRight;
            }
        }
        return false;
    }
}
