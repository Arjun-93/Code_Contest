import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-->0){
            int n = sc.nextInt();
            int count = 0;
            for(int i=0; i<n; i++){
                int digit = sc.nextInt();
                if(digit>=1000){
                    count++;
                }
            }System.out.println(count);
        }
    }

    public static int chek_1000(){
        return 1000;
    }

    public static void is_palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("LOSES");
                return;
            }
            i++;
            j--;
        }
        System.out.println("WINS");
    }
}


