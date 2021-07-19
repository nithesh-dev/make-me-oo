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
        Point vector = calculateVector(to);
        return sqrt(pow(vector.xCoordinate, 2) + pow(vector.yCoordinate, 2));
    }

    public double direction(Point to) {
        Point vector = calculateVector(to);
        return atan2(vector.yCoordinate, vector.xCoordinate);
    }

    private Point calculateVector(Point to) {
        double xDistance = calculateDifference(to.xCoordinate, xCoordinate);
        double yDistance = calculateDifference(to.yCoordinate, yCoordinate);
        return new Point(xDistance, yDistance);
    }

    private static double calculateDifference(double to, double from) {
        return to - from;
    }
}
