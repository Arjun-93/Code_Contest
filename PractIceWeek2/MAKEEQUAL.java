import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MAKEEQUAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n = s1.length();
            int flag = 0;
            for(int i=0; i<n; i++){
                if((s1.charAt(i) == s2.charAt(i)) || s1.charAt(i)=='?' || s2.charAt(i)=='?'){
                    continue;
                }else{
                flag =1;
            }}

            if(flag == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }

    }
}

}









        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-->0){
        //     int N =  sc.nextInt();
        //     ArrayList<Integer> arr = new ArrayList<>();
        //     int temp =N;
        //     while(temp-->0){
        //         arr.add(sc.nextInt());
        //     }
        //     int min = Collections.min(arr);
        //     int max = Collections.max(arr);
        //     System.out.println(max-min);
        // }
    

