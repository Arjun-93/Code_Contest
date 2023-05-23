package DSA.Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        
        long max_so_far = Integer.MIN_VALUE;
        long max_ending = 0;
        int[] nums = {1,2,33,5,6,8,-54};
        int n = nums.length;

        for( int  i=0; i<n; i++){
            max_ending += nums[i];
            if(max_so_far < max_ending){
                max_so_far = max_ending;
            }if(max_ending<0){
                max_ending = 0;
            }
        }
        System.out.println(max_so_far);
    }
}
