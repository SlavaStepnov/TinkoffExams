package org.example.task5;

import java.util.Scanner;

public class Tinkoff5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int length = line.length();
            for (int i = 0; i < length; i++) {
                char currentChar = line.charAt(i);

                if ((currentChar == 'a' || currentChar == 'A') &&
                        (i == 0 || !Character.isLetterOrDigit(line.charAt(i - 1))) &&
                        (i == length - 1 || !Character.isLetterOrDigit(line.charAt(i + 1)))) {
                    countA++;
                }
            }
        }

        scanner.close();
        System.out.println(countA);
    }
}
