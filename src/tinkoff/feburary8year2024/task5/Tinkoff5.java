package tinkoff.feburary8year2024.task5;

import java.util.Scanner;

public class Tinkoff5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String password = scanner.nextLine();

        int sorrowCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    sorrowCount++;
                }
            }
        }
        System.out.println(sorrowCount);
    }
}
