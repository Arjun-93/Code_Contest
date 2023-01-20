package Contest2;

import java.util.Scanner;

public class FARFROMO {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            double alex = (double) Math.sqrt(x1 * x1 + y1 * y1);
            double bob = (double) Math.sqrt(x2 * x2 + y2 * y2);
            if (alex > bob) {
                System.out.println("ALEX");
            } else if (alex < bob) {
                System.out.println("BOB");
            } else {
                System.out.println("EQUAL");
            }
        }
    }
}
