package DSA.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        reverseArray(nums);
    }

    public static void reverseArray(int[] nums){
        for(int i=nums.length -1; i<=0; i++){
            System.out.println(nums[i]);
        }
    }
}
