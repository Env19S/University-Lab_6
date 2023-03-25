package org.example.var1;

public class ProductSeries3Task3 {
    public static void main(String[] args) {
        double product = 1;

        for (int i = 1; i <= 8; i++) {
            double innerSum = 0;

            for (int j = 1; j <= 2 * i - 1; j++) {
                double innerInnerSum = 0;

                for (int k = i + j; k >= 1; k--) {
                    double cosValue = Math.cos(i - 0.5 * k);

                    if (cosValue != 0) {
                        innerInnerSum += 2 * j - 3 * Math.log(Math.abs(cosValue));
                    }
                }

                innerSum += innerInnerSum;
            }

            product *= innerSum;
        }

        System.out.println("Результат вычисления выражения 3: " + product);
    }
}
