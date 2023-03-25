package org.example.var1;

import java.util.Scanner;

public class NumberConversioTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion;

        do {
            System.out.print("Введите целое десятичное число: ");
            int decimalNumber = scanner.nextInt();

            int base;
            do {
                System.out.print("Введите основание системы счисления (от 2 до 36): ");
                base = scanner.nextInt();
            } while (base < 2 || base > 36);

            String convertedNumber = Integer.toString(decimalNumber, base);
            System.out.println("Число " + decimalNumber + " в системе счисления с основанием " + base + ": " + convertedNumber);

            System.out.print("Хотите продолжить перевод чисел? (да/нет): ");
            continueConversion = scanner.next().equalsIgnoreCase("да");
        } while (continueConversion);

        scanner.close();
    }
}
