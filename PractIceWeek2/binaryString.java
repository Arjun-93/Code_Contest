import java.util.Scanner;

public class binaryString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            String s = sc.next();
            int count = 0;

            if(s == "1" | s == "10"){
                System.out.println("NO");
            }
            else{
                for(int i=0; i<N; i++){
                    if(s.charAt(i)=='1'){
                        count++;
                    }
                }if(count<=3){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");}
            }
        }
    }
}
