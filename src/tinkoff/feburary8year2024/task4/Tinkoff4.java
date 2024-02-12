package tinkoff.feburary8year2024.task4;

import java.util.HashSet;
import java.util.Scanner;

public class Tinkoff4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String route = scanner.next();

        HashSet<Integer> visitedRooms = new HashSet<>();

        int x = 0;
        int y = 0;

        visitedRooms.add(getRoomIndex(x, y));

        for (int i = 0; i < N; i++) {
            switch (route.charAt(i)) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }

            int roomIndex = getRoomIndex(x, y);

            if (visitedRooms.contains(roomIndex)) {
                System.out.println("YES");
                return;
            }
            visitedRooms.add(roomIndex);
        }
        System.out.println("NO");
    }
    private static int getRoomIndex(int x, int y) {
        return x * 1000000 + y;
    }
}