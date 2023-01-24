

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class CHFSPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                arr.add(sc.nextInt());
            }
            ArrayList<Integer> B = new ArrayList<>();
            int check =arr.get(0);
        
            for( int i=0; i<n; i++){
                int count =0;
                for(int j=0; j<n; j++){
                        if(arr.get(i)<arr.get(j)){
                            count++;
                        }
                }
                B.add(count);
            }
            System.out.println(B);
        }


        // while(t-->0){
        //     int n = sc.nextInt();
        //     ArrayList<Integer> arr = new ArrayList<>();
        //     for(int i=0; i<n; i++){
        //         arr.add(sc.nextInt());
        //     }
        //     int difference = Integer.MAX_VALUE;
        //     for(int j=0; j<n; j++){
        //         for(int k1=0; k1<n; k1++){
        //             if(j!=k1){
        //                 int diff = Math.abs(arr.get(j)-arr.get(k1));
        //                 if(diff<difference){
        //                     difference = diff;
        //                 }
        //             }
        //         }
        //     }
        //     System.out.println(difference);
        }


        // while(t-->0){
        //     long A = sc.nextInt();
        //     long B = sc.nextInt();
        //     long C= sc.nextInt();
        //     long arr[] = {(A+B), (B+C), (A+C)};
        //     long max = Integer.MIN_VALUE;
        //     for(int i=0; i<3; i++){
        //         if(arr[i]>max){
        //             max = arr[i];
        //         }
        //     }
        //     System.out.println(max);
        // }
    }











