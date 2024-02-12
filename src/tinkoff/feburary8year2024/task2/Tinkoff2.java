package tinkoff.feburary8year2024.task2;

import java.util.Scanner;

public class Tinkoff2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalCards = 4 * N;

        int[] countArray = new int[N + 1];

        for (int i = 0; i < totalCards - 1; i++) {
            int number = sc.nextInt();
            countArray[number]++;
        }

        int missingNumber = 0;
        for (int i = 1; i <= N; i++) {
            if (countArray[i] < 4) {
                missingNumber = i;
                break;
            }
        }

        System.out.println(missingNumber);
    }
}
