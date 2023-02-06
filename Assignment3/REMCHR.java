import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class REMCHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ans = check(s);
            System.out.println(ans);
        }
    }

    public static int check(String str){
        Stack st = new Stack<>();
        for (char c : str.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            } else{
                char temp = (char) st.peek();
                if(c == temp){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }
        return st.size();
    }
}
