package com.epam.dzmitry.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = enterValue();
        double b = enterValue();
        System.out.println("Периметр = " + calculatePerimeter(a, b));
        System.out.println("Площадь = " + calculateSquare(a, b));
    }

    public static double enterValue() {
        Scanner scanner = new Scanner(System.in);
        double result;
        do {
            System.out.println("Введите значение катета");
            while (!scanner.hasNextDouble()) {
                System.out.println("Вы ввели некоректное число");
                scanner.next();
            }
            result = scanner.nextDouble();
        } while (!validate(result));
        System.out.println("Принято!");
        return result;
    }

    public static boolean validate(double a) {
        if (a <= 0) {
            System.out.println("Отрицательные нельзя!!!!!");
            return false;
        }
        return true;
    }

    public static double calculateSquare(double a, double b) {
        return (a * b) / 2;
    }

    public static double calculatePerimeter(double a, double b) {
        double c = Math.pow((a * a) + (b * b), 0.5);
        return a + b + c;
    }
}
