package homework29022020;

public class Q5 {
    public static void main(String[] args) {
        Pallindrome();
    }

    public static void Pallindrome() {
        int num = 11211, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;


        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
