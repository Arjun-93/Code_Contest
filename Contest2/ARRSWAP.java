package Contest2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ARRSWAP {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long N = sc.nextInt();
            long temp = N;
            ArrayList<Long> ans = new ArrayList<Long>();
            int i = 0;
            while (temp -- > 0) {
                long ai = sc.nextInt();
                ans.add(ai);
            }
            while (N-- > 0) {
                long bi = sc.nextInt();
                ans.add(bi);
            }
            // int result = check(ans);
            // System.out.println(result);
            Collections.sort(ans);
            // System.out.println("Sorted ArrayList: " + ans);
            // System.out.println(ans.size());

            long resultA = ans.get(ans.size()/2-1) - ans.get(0);
            long resultB = ans.get(ans.size()-1) - ans.get(ans.size()/2);
            if(resultA < resultB) {
                System.out.println(resultA);
            } else {
                System.out.println(resultB);
            }
        }
    }

    public static int check(ArrayList<Integer> ans) {
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < ans.size(); i++) {
            for(int j = i+1; j < ans.size(); j++) {
                int lts = ans.get(i) - ans.get(j);
                if(lts < difference) {
                    difference = lts;
                }
            }
        }
        return difference;
    }
}

