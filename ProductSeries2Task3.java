package org.example.var1;

public class ProductSeries2Task3 {
    public static void main(String[] args) {
        double product = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                product *= (Math.cos(j) + Math.sin(i)) / (Math.sin(j) * Math.cos(i));
            }
        }

        System.out.println("Результат вычисления выражения 2: " + product);
    }
}
