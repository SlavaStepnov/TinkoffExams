package org.example.task2;

import java.util.Scanner;

public class Tinkoff2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(4 * (n - 1));
        }
    }
}
