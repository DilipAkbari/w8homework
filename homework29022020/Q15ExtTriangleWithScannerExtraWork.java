package homework29022020;//15. Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class Q15ExtTriangleWithScannerExtraWork {
    public static void main(String[] args) {
        a1();
    }

    public static void a1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int raws = sc.nextInt();
        for (int i = 1; i <= raws; i++) {
            //for space
            for (int s = 0; s < (raws - i); s++) {
                System.out.print(" ");
                //for *
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
