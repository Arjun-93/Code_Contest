package PractIceWeek2;
import java.util.Scanner;

public class SMOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long N =sc.nextInt();
            long K = sc.nextInt();
            // System.out.println(findN(N,K));
            if(K!=0){
                System.out.println(N%K);
            }else{
                System.out.println(N);
            }
        }
    }
    public static long findN(long N, long K ){
        if(N==K){
            return 0;
        }else if(N<K){
            return N;
        } else{
            return findN(N-K,K);
        }
    }
}
