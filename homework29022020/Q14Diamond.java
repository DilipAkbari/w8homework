package homework29022020;//14. Write a program in Java to display the pattern like a diamond.    While loop

public class Q14Diamond {
    public static void main(String[] args) {
        diamn1();
    }

    public static void diamn1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}



