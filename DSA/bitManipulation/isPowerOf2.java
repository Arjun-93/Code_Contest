package DSA.bitManipulation;

public class isPowerOf2 {
    public static void main(String[] args) {
        
    }
    public static boolean check(int N){
        if( N==0 ){ return false;}
        int x = N & (N-1);
        if( x==0){ 
            return true;
        }
        return false;
    }
}
