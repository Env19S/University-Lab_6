package org.example.var1;

public class SumSeries1Task3 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                sum += Math.log(Math.pow(j + 1, i));
            }
        }

        System.out.println("Результат вычисления выражения 1: " + sum);
    }
}