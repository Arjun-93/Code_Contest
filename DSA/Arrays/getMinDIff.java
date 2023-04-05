package DSA.Arrays;

public class getMinDIff {
    public static void main(String[] args) {
        int  k =2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] nums = {1};
        for (int i =0; i< nums.length ; i++){
            if(nums[i]<min){
                min = nums[i];
            }else{
                max = nums[i];
            }
        }
        System.out.println(max - (2*k + min));
    }
}
