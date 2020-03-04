package homework29022020;

import java.util.Scanner;

public class Q10ArmStrongNumber {

    public static void main(String[] args) {
        Q10ArmStrongNumber mk = new Q10ArmStrongNumber();
        main1();
    }
    public static void main1() {
        int num = 0, originalNum, remainder, result = 0;
        System.out.print("Enter a three-digit integer: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += remainder * remainder * remainder;
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}