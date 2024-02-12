package tinkoff.feburary8year2024.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Tinkoff3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int W = scanner.nextInt();

        int[] x = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }

        Arrays.sort(x);

        int count = 0;
        int lastPosition = 0;

        for (int i = 0; i < N; i++) {
            int gap = x[i] - lastPosition;
            count += gap / W;
            if (gap % W != 0) {
                count++;
            }
            lastPosition = x[i] + W;
        }

        int remaining = L - lastPosition;
        count += remaining / W;
        if (remaining % W != 0) {
            count++;
        }
        System.out.println(count);
    }
}
