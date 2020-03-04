package homework29022020;

public class Q4DigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstLast(125));
    }
    public static int sumFirstLast(int m) {
        int m1 = m;
        int LastDigit, count = 0;
        while (m >= 10) {
            LastDigit = m % 10;
            m = m1 / 10;
            m1 = m;
            count = count + LastDigit;
        }
        return count + 1;
    }
}

