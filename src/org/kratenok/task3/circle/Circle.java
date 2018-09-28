package org.kratenok.task3.circle;


public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLengthCircle() {
        return 2 * Math.PI * radius;
    }
}
