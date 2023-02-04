package Contest4;

import java.util.Scanner;

public class ZEROSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int count0 = 0;
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            if (count0 >= count1) {
                System.out.println(count1);
            } else {
                System.out.println(count0 + 1);
            }
        }
    }

}
