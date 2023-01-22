import java.util.Scanner;

public class PAIREQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int j = 1;
            for(int i=0; i<n; i++){
                if(arr[i]!=arr[j]){
                    count++;
                    j++;
                }
                if(j==n){
                    break;
                }
                if(arr[i]==arr[j]){
                    j++;
                }
                
            }
            System.out.println(count);
        }
    }
}