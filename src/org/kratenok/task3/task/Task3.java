package org.kratenok.task3.task;

import org.kratenok.task3.circle.Circle;

public class Task3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Длина окружности: " + circle.getLengthCircle());
    }
}
