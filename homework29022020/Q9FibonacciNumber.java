package homework29022020;//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Q9FibonacciNumber {
    public static void main(String[] args) {
        // Set it to the number of elements you want in the Fibonacci Series
        // int max = 8;
        Q9FibonacciNumber acda = new Q9FibonacciNumber();
        acda.d1();
    }
    public void d1() {
        int a = 1;
        int b = 1;
        System.out.println("Fibonacci Number : ");
        for (int i = 1; i <= 8; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
