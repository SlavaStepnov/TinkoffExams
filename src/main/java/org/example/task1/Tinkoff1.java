package org.example.task1;

import java.util.Scanner;

public class Tinkoff1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        short a = 100;
        long k = n - a + 1;
        long sum = (k * (a + n)) / 2;

        System.out.println(sum);
    }
}
