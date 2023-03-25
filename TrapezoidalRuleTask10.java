package org.example.task10;

import java.text.DecimalFormat;

public class TrapezoidalRuleTask10 {
    public static double function(double x) {
        return Math.exp(2 - 5) + Math.pow(x, 5) - Math.pow(x, 3);
    }

    public static double calculateTrapezoidalArea(int n, double a, double b) {
        double h = (b - a) / n;
        double sum = 0;

        for (int i = 1; i < n; i++) {
            sum += function(a + i * h);
        }

        return h * ((function(a) + function(b)) / 2 + sum);
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;

        System.out.println("n\th\t\tS\t\tАналитическое решение\tПогрешность");
        int[] ns = {10, 100, 1000, 10000};
        double referenceArea = calculateTrapezoidalArea(10000, a, b);

        for (int n : ns) {
            double area = calculateTrapezoidalArea(n, a, b);
            double error = Math.abs(area - referenceArea);
            printResult(n, (b - a) / n, area, referenceArea, error);
        }
    }

    private static void printResult(int n, double h, double area, double referenceArea, double error) {
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(n + "\t" + df.format(h) + "\t" + df.format(area) + "\t\t" + df.format(referenceArea) + "\t\t\t" + df.format(error));
    }
}
