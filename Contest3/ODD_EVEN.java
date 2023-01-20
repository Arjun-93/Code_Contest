import java.util.ArrayList;
import java.util.Scanner;

public class ODD_EVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        while(t-->0){
            int n =sc.nextInt();
            while(n-->0){
                A.add(sc.nextInt());
            }
            int count_0 = 0;
            int count_1 = 0;
            for(int i=0; i<n; i++){
                if(A.get(i)==0){
                    count_0++;
                }
                else{
                    count_1++;
                }
            }
            if(count_1%2!=0 && n%2==0){
                System.out.println("YES");
            }
            else if(count_1%2==0 && n%2!=0){
                System.out.println("NO");
            }
            else if(count_0%2==0 && n%2==0){
                System.out.println("YES");
            }
            else if(count_0%2!=0 && n%2!=0){
                System.out.println("NO");
            }
        }
    }
}
