package homework29022020;//6. Write a program in Java to display the pattern like triangle with a number.

import java.util.Scanner;

public class Q6TriangleWithNumber {
    public static void main(String[] args) {
        Q6TriangleWithNumber d1 = new Q6TriangleWithNumber();
        d1.m1();
    }

    public void m1() {
        int i, j, n;
        System.out.print("Input Number Of Rows: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
