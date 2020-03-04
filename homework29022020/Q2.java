package homework29022020;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        min();
    }
    public static void min() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number(to exit enter any letter):");
            boolean isAnint = sc.hasNextInt();
            if (isAnint) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("min=" + min + " max=" + max);
        sc.close();
    }
}