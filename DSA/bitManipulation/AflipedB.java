package DSA.bitManipulation;

public class AflipedB {
    public static void main(String[] args) {
        System.out.println(check(10, 20));
    }

    public static int check(int A, int B){
        int count = 0;
        int xor = A^B;
        String binaryString = Integer.toBinaryString(xor);
        // System.out.println(binaryString);
        for(int i =0; i<binaryString.length(); i++){
            if(binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
