package PractIceWeek2;

import java.util.Scanner;

public class CHFSPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long A = sc.nextInt();
            long B = sc.nextInt();
            long C= sc.nextInt();
            long arr[] = {(A+B), (B+C), (A+C)};
            long max = Integer.MIN_VALUE;
            for(int i=0; i<3; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
