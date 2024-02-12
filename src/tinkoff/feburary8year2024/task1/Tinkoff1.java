package tinkoff.feburary8year2024.task1;
import java.util.Scanner;
public class Tinkoff1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] passwordArray = password.toCharArray();
        if (a >= 1 && b <= password.length() && a <= b) {
            char temp = passwordArray[a - 1];
            passwordArray[a - 1] = passwordArray[b - 1];
            passwordArray[b - 1] = temp;
        }
        String newPassword = new String(passwordArray);

        System.out.println(newPassword);
    }
}
