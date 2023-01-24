

import java.util.Scanner;

public class IMDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int space[] = new int[N];
            int Rating[] = new int[N];
            int i=0;
            while(N-->0){
                space[i] = sc.nextInt();
                Rating[i] = sc.nextInt();
                i++;
            }
            int M =0;
            for(int j=0; j<space.length; j++){
                if(space[j]<=X && Rating[j]>M){
                    M = Rating[j];
                }
            }
            System.out.println(M);
        }
    }
}
