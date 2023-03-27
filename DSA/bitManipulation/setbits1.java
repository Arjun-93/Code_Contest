package DSA.bitManipulation;

public class setbits1 {
    public static void main(String[] args) {
        System.out.println(setbit(6));
    }

    public static int setbit(int N){
        int ans = 0;
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        for( int i=0; i<binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                ans++;
            }
        }
        // while(N>0){
        //     int bit  =N&1;
        //     if(bit==1) ans++;
        //     N = N>>1;
        // }
        // return ans;
        return ans;
    }
}


