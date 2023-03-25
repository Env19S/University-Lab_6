package org.example.task9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RootNewtonMethodTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите степень p: ");
        int p = scanner.nextInt();

        System.out.println("Точность\t\tКорень\t\tЧисло итераций");

        for (int k = 2; k <= 10; k++) {
            double eps = Math.pow(10, -k);
            double root = rootOfDegreeP(x, p, eps);
            int iterations = countIterations(x, p, eps);
            printResult(eps, root, iterations);
        }
    }

    private static double rootOfDegreeP(double x, int p, double eps) {
        double y0 = Math.exp(Math.log(x * (p + 1)) / p);
        double y1;

        do {
            y1 = (1.0 / p) * (((p - 1) * y0) + (x / Math.pow(y0, p - 1)));
            double temp = y0;
            y0 = y1;
            y1 = temp;
        } while (Math.abs(y1 - y0) > eps);

        return y0;
    }

    private static int countIterations(double x, int p, double eps) {
        double y0 = Math.exp(Math.log(x * (p + 1)) / p);
        double y1;
        int iterations = 0;

        do {
            y1 = (1.0 / p) * (((p - 1) * y0) + (x / Math.pow(y0, p - 1)));
            double temp = y0;
            y0 = y1;
            y1 = temp;
            iterations++;
        } while (Math.abs(y1 - y0) > eps);

        return iterations;
    }

    private static void printResult(double eps, double root, int iterations) {
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(eps) + "\t\t" + df.format(root) + "\t\t" + iterations);
    }
}
