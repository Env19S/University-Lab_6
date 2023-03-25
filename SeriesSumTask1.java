package org.example.var1;

import java.util.Scanner;

import java.util.Locale;

public class SeriesSumTask1 {

    public static double calculateSeriesTerm(int n, double x) {
        return Math.pow(-1, n - 1) * (Math.pow(x, 2 * n - 1) / (Math.cos(n) - Math.sin(n)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // установить локаль для использования точки в качестве разделителя дробной части

        System.out.println("Введите значение N:");
        int N = scanner.nextInt();

        System.out.println("Введите значение M:");
        double M = scanner.nextDouble();

        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();

        double sumN = 0;
        double sumM = 0;
        double term;

        for (int n = 1; n <= N; n++) {
            term = calculateSeriesTerm(n, x);

            if (Math.abs(term) < M) {
                sumM += term;
            }

            sumN += term;
        }

        System.out.println("Сумма первых N членов ряда: " + sumN);
        System.out.println("Сумма членов ряда, меньше числа M: " + sumM);
    }
}
