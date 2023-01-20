package Contest2;

import java.util.Scanner;

public class RAIN8TEST {
    // public static void main(String[] args) throws java.lang.Exception {
    // Scanner sc = new Scanner(System.in);

    // int t = sc.nextInt();
    // while (t-- > 0) {
    // int n = sc.nextInt();
    // long x = sc.nextInt();
    // long amount = 0;
    // int flag = 0;
    // while (n-- > 0) {
    // int di = sc.nextInt();
    // if (di == 1) {
    // amount += x;
    // flag = 1;
    // } else if (di == 0 && flag == 1) {
    // amount += x;
    // flag = 0;
    // } else if (di == 0 && flag == 0) {
    // amount = amount;
    // }
    // }
    // System.out.println(amount);
    // }
    // }

    // public static void main(String[] args) throws java.lang.Exception {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();

    // while (t-- > 0) {
    // long n = sc.nextInt();
    // long x1 = sc.nextInt();
    // long x2 = sc.nextInt();
    // long x3 = sc.nextInt();
    // long x4 = sc.nextInt();
    // long x5 = sc.nextInt();
    // long x6 = sc.nextInt();
    // long total_amount = 0;
    // if (n == 1) {
    // total_amount = ((x1 + x2 + x3 + x4 + x5 + x6) / 2);
    // System.out.println(total_amount);
    // }
    // else if (n>1 && n%2==0) {
    // total_amount = ((x1 + x2 + x3 + x4 + x5 + x6) ) * (n/2);
    // System.out.println(total_amount);
    // }
    // else {
    // n = n + 1;
    // System.out.println(n);
    // total_amount = ((x1 + x2 + x3 + x4 + x5 + x6)) * n/2;
    // System.out.println(total_amount);

    // }
    // }
    // }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            double P = sc.nextDouble();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            double changeInProximity = 0;
            if (Z == 0) {
                changeInProximity = ((P * X) / 100);
                System.out.println(P - changeInProximity);
            } else {
                changeInProximity =  ((P * Y) / 100);
                System.out.println(P + changeInProximity);
            }
        }
    }
}
