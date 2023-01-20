package PractIceWeek2;

import java.util.Scanner;

public class ALPHABHET {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String s = sc.nextLine();
    // int t = Integer.parseInt(sc.nextLine());
    // while (t-- > 0) {
    // String p = sc.nextLine();
    // int flag = 0;
    // for (int i = 0; i < p.length(); i++) {
    // if (s.contains(p.charAt(i) + "")) {
    // flag = 1;
    // } else {
    // flag = 0;
    // break;
    // }
    // }
    // if (flag == 1) {
    // System.out.println("Yes");
    // } else {
    // System.out.println("No");
    // }
    // }
    // }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            

            // if (n == 7) {
            //     System.out.println(count);
            // } else if (n > 7) {
            //     int max = Integer.MIN_VALUE;
            //     for (int i = 0; i < 6; i++) {
            //         if (arr[i] > max) {
            //             max = arr[i];
            //         }
            //     }
            //     for (int i = 7; i < n; i++) {
            //         if (arr[i] < max) {
            //             count++;
            //         }
            //     }
            //     System.out.println(count);
            // }
        }
    }

    public static int minProblemsToSolve(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= 7) {
                count++;
            }
        }
        return count;
    }
}
