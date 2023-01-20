import java.util.Scanner;

public class luckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int count = 0;
        // for( int i=0; i<4; i++){
        // int N = sc.nextInt();
        // if(N>=10){
        // count++;
        // }
        // }System.out.println(count);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int max_differnce = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int difference = Math.abs(i - j);
                    if (i + j == s && max_differnce < difference) {
                        max_differnce = difference;
                    }
                }
            }
            System.out.println(max_differnce);
        }
    }
}