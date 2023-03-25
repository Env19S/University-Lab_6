package org.example.var1;

public class MultiplicationTableTask7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d", j, i, j * i);

                if (j < 9) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

