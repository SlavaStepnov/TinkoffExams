package org.example.task4;

import java.util.Scanner;

public class Tinkoff4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String inputString = scanner.nextLine();
        scanner.close();

        int countA = 0;

        for (int i = 0; i < n; i++) {
            if (inputString.charAt(i) == 'a') {
                countA++;
            }
        }

        System.out.println(countA);
    }
}
