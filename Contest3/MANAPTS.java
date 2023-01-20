import java.util.Scanner;

public class MANAPTS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int X =sc.nextInt();
            int Y =sc.nextInt();   
            System.out.println(Y/X);
        }
    }
}