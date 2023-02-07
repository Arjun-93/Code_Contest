package Contest5;

import java.util.Scanner;
import java.util.Stack;

public class COMPILER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String str = sc.next();
            Stack st = new Stack<>();
            int count =0;
            for (char c : str.toCharArray()){
                if(c == '<'){
                    st.push(c);
                    count++;
                }else{
                    char top = (char) st.pop();
                    if(st.isEmpty()){
                        break;
                    }
                    else if (c == '>' && top != '<') {
                    count++;
                }}
            }
            System.out.println(count);
        }
    }
}
