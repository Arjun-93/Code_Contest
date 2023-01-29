

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CHFSPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int sum = 0;
            if(s.charAt(0)=='0'){
                for(int i=0; i<N; i++){
                    if(s.charAt(i)=='0'){
                        sum = Math.max(sum, count);
                    }
                    else {
                        count++;
                    }
                }
                sum = Math.max(sum, count);
            }
            else{
                int p =0;
                int j =0;
                for(int i=0; i<N; i++){
                    if(s.charAt(i)=='1'){
                        p++;
                    }
                    else{
                        j = i;
                        break;
                    }
                }
                for(int i=j; i<N; i++){
                    if(s.charAt(i)=='0'){
                        sum = Math.max(sum, count);
                    }
                    else {
                        count++;
                    }
                }
                sum = Math.max(sum, count);
                sum = sum + p;
            }
            System.out.println(sum);




            // int count = 0;
            // for(int i=0; i<binaryString.length(); i++){
            //     if(binaryString.charAt(i)=='1'){
            //         count++;
            //     }
            // }
            // if(binaryString == "1" || binaryString == "10"){
            //     System.out.println("NO");
            // } else if(count<=3){
            //     System.out.println("YES");
            // } else{
            //     System.out.println("NO");
            // }
            // if (isSumOfThreePowersOfTwo(binaryString)) {
            //     System.out.println("YES");
            // } else {
            //     System.out.println("NO");
            // }
            // int decimal = 0;
            // int power = 0;
            // int count =0;
            // for (int i = binaryString.length() - 1; i >= 0; i--) {
            //     if (binaryString.charAt(i) == '1') {
            //         decimal += Math.pow(2, power);
            //         count++;
            //     }
            //     power++;
            // }
            // if(count==3){
            //     System.out.println("YES");
            // } else if(count<3 && N>=3){
            //     System.out.println("YES");
            // } else{
            //     System.out.println("NO");
            // }
        }

    }
    public static boolean isSumOfThreePowersOfTwo(String binaryString) {
        int onesCount = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                onesCount++;
            }
        }
        if (onesCount != 3) {
            return false;
        }
    
        int[] powers = new int[3];
        int powerCount = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                powers[powerCount] = i;
                powerCount++;
            }
        }
        System.out.println(powers[0] + " " + powers[1] + " " + powers[2]);
        return (powers[2] - powers[1] != 1) && (powers[1] - powers[0] != 1);
    }
    







            // ArrayList<Integer> B = new ArrayList<>();
            // int check =arr.get(0);
        
            // for( int i=0; i<n; i++){
            //     int count =0;
            //     for(int j=0; j<n; j++){
            //             if(arr.get(i)<arr.get(j)){
            //                 count++;
            //             }
            //     }
            //     B.add(count);
            // }
            // System.out.println(B);
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
    











