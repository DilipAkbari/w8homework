package homework29022020;

import java.util.Scanner;

public class Q9ExtFibonacciNumberWithScannerExtraWork {
    public static void main(String[] args) {
        Q9ExtFibonacciNumberWithScannerExtraWork m2 = new Q9ExtFibonacciNumberWithScannerExtraWork();
        m2.m1();
    }

    public void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Max Number: ");
        int d = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print("Fibonacci Number Is: ");
        for (int i = 1; i <= d; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

