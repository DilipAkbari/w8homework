package homework29022020;

//8. Display right angle triangle of @ using nested for loops
public class Q8RightAngleTriangle {
    public static void main(String[] args) {
        Q8RightAngleTriangle m2 = new Q8RightAngleTriangle();
        m2.m1();
    }
    public void m1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 0; j++) {
                System.out.println("");
            }
            for (int s = 0; s < (i * 1 - 0); s++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}