import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HORSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            ArrayList<Long> S = new ArrayList<>();
            int temp = N;
            while(temp-->0){
                S.add(sc.nextLong());
            }
            Collections.sort(S);
            int min = Integer.MAX_VALUE;
            int j = 0;
            for(int i=0; i<N-1; i++){
                j = i+1;
                if(S.get(j)-S.get(i)<min){
                    min = (int) (S.get(j)-S.get(i));
                }
            }
            System.out.println(min);
        }
    }
}
