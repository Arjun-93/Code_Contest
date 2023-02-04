package Contest4;

import java.util.Scanner;

public class RACE400M {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z   = sc.nextInt();
            double Alice = 400/X;
            double Bob = 400/Y;
            double charlie = 400/Z;

            if(Alice < Bob && Alice < charlie){
                System.out.println("Charlie");
            }else if(Bob < Alice && Bob < charlie){
                System.out.println("Bob");
            }else if(charlie < Alice && charlie < Bob){
                System.out.println("Alice");
            }
        }
    }
}
