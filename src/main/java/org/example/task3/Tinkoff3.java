package org.example.task3;

import java.util.Scanner;

public class Tinkoff3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int interestingPairsCount = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }

            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int k = 0; k < n; k++) {
                    colSum += matrix[k][j];
                }

                if (Math.abs(rowSum - colSum) <= matrix[i][j]) {
                    interestingPairsCount++;
                }
            }
        }
        System.out.println(interestingPairsCount);
    }
}
