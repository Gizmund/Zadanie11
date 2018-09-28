package org.kratenok.task1.task;

import org.kratenok.task1.converter.Converter;

public class Task1 {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("Конвертация по курсу: " + converter.toUSD(100 , 20));
        System.out.println("Конвертация по курсу: " + converter.toUSD(200 , 10));
    }
}
