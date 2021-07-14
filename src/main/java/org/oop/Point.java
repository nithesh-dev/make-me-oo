package org.oop;

import static java.lang.Math.*;

public class Point {
    private final double xCoordinate;
    private final double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double distance(Point to) {
        double xDistance = calculateDifference(to.xCoordinate, xCoordinate);
        double yDistance = calculateDifference(to.yCoordinate, yCoordinate);
        return sqrt(square(xDistance) + square(yDistance));
    }

    public double direction(Point to) {
        double xDistance = calculateDifference(to.xCoordinate, xCoordinate);
        double yDistance = calculateDifference(to.yCoordinate, yCoordinate);
        return atan2(yDistance, xDistance);
    }

    private static double calculateDifference(double to, double from) {
        return to - from;
    }

    private static double square(double value) {
        return pow(value, 2);
    }
}
