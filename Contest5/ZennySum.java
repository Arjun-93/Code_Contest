package Contest5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ZennySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum_pos = 0;
            int sum_neg = 0;
            Set st = new HashSet<Integer>();
            int n = sc.nextInt();
            for(int i =0; i<n; i++){
                int x = sc.nextInt();
                st.add(x);
            }

            Iterator<Integer> iter = st.iterator();
            while(iter.hasNext()){
                int elem = iter.next();
                if(elem>=0){
                    sum_pos += elem;
                }
                else{
                    sum_neg += elem;
                }
            }
            System.out.println(sum_pos);
            System.out.println(sum_neg);
            sc.close();
        }
    }
}
