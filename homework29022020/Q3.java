package homework29022020;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.SingleChar();
    }

    Scanner in = new Scanner(System.in);

    public void SingleChar() {

        System.out.print("Input an Albhabet :");
        String input = in.next().toLowerCase();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        if (input.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
