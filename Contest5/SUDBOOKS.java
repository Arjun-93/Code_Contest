package Contest5;

import java.util.Scanner;
import java.util.Stack;

public class SUDBOOKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while (Q-- > 0) {
            String[] inp = sc.nextLine().split(" ");
            int option = Integer.parseInt(inp[0]);
            if (option == -1) {
                if (!st.isEmpty()) {
                    int ans = st.peek();
                    System.out.println(ans);
                    st.pop();
                } else {
                    System.out.println("Kuchbhi?");
                }
            } else {
                int num = Integer.parseInt(inp[1]);
                st.push(num);
            }
        }
        sc.close();
    }
}
