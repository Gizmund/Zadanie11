package org.kratenok.task4.interval;

import java.util.Random;

public class Interval {
    public int randomInterval(int a, int b){
        Random random = new Random();
        return random.nextInt((b - a) + 1) + a;
    }
}
