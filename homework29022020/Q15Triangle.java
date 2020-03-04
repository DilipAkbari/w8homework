package homework29022020;

//14. Write a program in Java to display the pattern like a diamond.    While loop
public class Q15Triangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            //for space
            for (int s = 0; s < (5 - i); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
