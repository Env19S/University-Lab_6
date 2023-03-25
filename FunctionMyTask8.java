package org.example.var1;

public class FunctionMyTask8 {
    public double functionOne(double x, double y) {
        return Math.sin(x) * Math.cos(y) - Math.cos(x) * Math.sin(y);
    }

    public double functionTwo(double x, double y) {
        return Math.sin(x) * Math.cos(y) + Math.cos(x) * Math.sin(y);
    }
}

class FunctionMyInteraction extends FunctionMyTask8 {
    public static void main(String[] args) {
        FunctionMyInteraction interaction = new FunctionMyInteraction();
        double x = 1.0;
        double y = 2.0;
        double sumFunctionOne = 0.0;
        double sumFunctionTwo = 0.0;

        for (int i = 0; i < 10; i++) {
            sumFunctionOne += interaction.functionOne(x + i, y);
            sumFunctionTwo += interaction.functionTwo(x + i, y);
        }

        System.out.println("Сумма 10 значений первой функции: " + sumFunctionOne);
        System.out.println("Сумма 10 значений второй функции: " + sumFunctionTwo);
    }
}
