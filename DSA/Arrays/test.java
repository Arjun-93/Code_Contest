package DSA.Arrays;

public class test {
    public static void main(String[] args) {
        String  st = "1101";
        int n = 11001;
        // String temp = Integer.toString(n);
        // String temp1 =
        int  temp = Integer.parseInt(st, 2);
        System.out.println(temp);
    }

    public String binarySum(String a, String b){
        long  temp1 = Long.parseLong(a, 2);
        long  temp2 = Long.parseLong(b, 2);
        long ans = temp1 + temp2;
        return Long.toBinaryString(ans);
    }
}
