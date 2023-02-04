

import java.util.Scanner;

public class IMDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(N<= X*Y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
