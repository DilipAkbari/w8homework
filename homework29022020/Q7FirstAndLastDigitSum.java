package homework29022020;

public class Q7FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(257);
    }

    public static int sumFirstAndLastDigit(int number) {
        int a, b;
        a = number % 10;
        if (number < 0) {
            number = -1;
            System.out.println(number + "since the parameter is negative and needs to be positive.");
            return number;
        } else if (number>=1 && number<10) {
            b = number;
            System.out.println("The first digit and last digit is " + a + "since we only have 1 digit which gives us" + b + "+" + a + "and the sum is " + (b + a));
            return number;
        }
        while (number>=10) {
            number = number/10;
        }
        b = number;
        System.out.println("The first digit is " + b + " and the last digit is" + a + "which gives us" + b + "+" + a + "and the sum is " + (b + a));
        return number;
    }
}
