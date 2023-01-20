import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FACEBOOK {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while(t-->0){
    //         int N =sc.nextInt();
    //         int temp = N;
    //         ArrayList<Integer> A = new ArrayList<Integer>();
    //         ArrayList<Integer> B = new ArrayList<Integer>();   
    //         while(N-->0){
    //             A.add(sc.nextInt());
    //         }
    //         while(temp-->0){
    //             B.add(sc.nextInt());
    //         }
    //         int max = Collections.max(A);
    //         System.out.println(max);
    //         // ArrayList<Integer> index = new ArrayList<Integer>();
    //         int index[] = new int[N];
    //         for(int i=0; i<N; i++){
    //             if(A.get(i)==max){
    //                 index[i] = i;
    //             }
    //         }
    //         System.out.println(index.length);
            // for(int i=0; i<index.size()-1; i++){
            //     if(index.size()==1){
            //         System.out.println(index.get(i)+1);
            //         break;
            //     }
            //     else{
            //         if(B.get(index.get(i))>B.get(index.get(i+1))){
            //             System.out.println(index.get(i)+1);
            //             break;
            //         }
            //         else{
            //             System.out.println(index.get(i+1)+1);
            //             break;
            //         }
            //     }
            // 
  
            public static void main (String[] args) throws java.lang.Exception
            {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
        
                while(t-->0){
                    int N = sc.nextInt();
                    int temp =N;
                    int A[]= new int[N];
                    int B[] = new int[N];
                    int j=0;
                   while(N-->0){
                        A[j] = sc.nextInt();
                    }
                    while(temp-->0){
                        B[j] = sc.nextInt();
                        j++;
                    }
                     int mostPopularPost = 0;
                    for (int i = 1; i < A.length; i++) {
                    if (A[i] > A[mostPopularPost] || (A[i] == A[mostPopularPost] && B[i] > B[mostPopularPost])) {
                        mostPopularPost = i;
                    }
                }
                System.out.println(mostPopularPost+1);
        }
            }
            
}
