
import java.util.HashMap;
import java.util.Scanner;

public class MATCHES{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("0", 6);
        map.put("1", 2);
        map.put("2", 5);
        map.put("3", 5);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 3);
        map.put("8", 7);
        map.put("9", 6);
        while(t-->0){
            long A = sc.nextInt();
            long B = sc.nextInt();
            long C = A+B;
            String s = String.valueOf(C);
            long sum = 0;
            for(int i =0; i<s.length(); i++){
                sum += map.get(String.valueOf(s.charAt(i)));
            }
            System.out.println(sum);
        }
    }
}