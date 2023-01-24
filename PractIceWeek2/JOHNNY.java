
import java.util.Scanner;

public class JOHNNY {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long k = minimumEatingSpeed(arr, h);
            System.out.println(k);
        }
    }


    public static long minimumEatingSpeed(long[] piles, long h) {
        int totalBananas = 0;
        for (int i = 0; i < piles.length; i++) {
            totalBananas += piles[i];
        }
        int low = 1;
        int high = totalBananas;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatAllBananas(piles, h, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    public static boolean canEatAllBananas(long[] piles, long h, int K) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / K;
            if (piles[i] % K != 0) {
                hours++;
            }
        }
        return hours <= h;
    }
}
