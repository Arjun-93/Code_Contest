import java.util.Scanner;

public class WEIGHTBL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int minDist = Math.abs(a-c) + Math.abs(b-d);
            if(minDist <=k && (k-minDist)%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }









        // EVEN SUm
        // while(t-->0){
        //     int n = sc.nextInt();
        //     double sum = n*(n+1)*0.5;
        //     double nextSum = n*(n+1)*0.5 - n;
        //     if(sum%2==0){
        //         System.out.println(n);
        //     }
        //     else{
        //         System.out.println(n-1);
        //     }
        // }





        // while(t-->0){
        //     double S = sc.nextDouble();
        //     double A = sc.nextDouble();
        //     double B = sc.nextDouble();
        //     double C = sc.nextDouble();
        //     double S_ = S + (S*C)/100;
        //     if(S_>= A && S_<=B){
        //         System.out.println("YES");
        //     }
        //     else{
        //         System.out.println("NO");
        //     }
        // }
    }
}
