package Contest2;

import java.util.Scanner;

public class NEGPROD {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c =  sc.nextInt();
		    
		    if((a>=0 && b>=0 && c>=0) |  (a<0 && b<0 && c<0)){
		        System.out.println("NO");
		    }
            else{
                System.out.println("YES");
            }
		}
	}
}
