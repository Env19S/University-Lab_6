package org.example.var1;

public class LogSeriesTask5 {
    public static void main(String[] args) {
        double x = 0.5; // Задайте значение x здесь

        for (double eps = 1e-2; eps >= 1e-4; eps *= 0.1) {
            double sum = 0;
            double term;
            int n = 1;

            do {
                term = Math.pow(-x, n) / n;
                sum += term;
                n++;
            } while (Math.abs(term) >= eps);

            double actualValue = Math.log(1 - x);
            double error = Math.abs(actualValue - sum);

            System.out.printf("При погрешности %.1e, сумма ряда: %.10f, итоговая погрешность: %.10f%n", eps, sum, error);
        }
    }
}
