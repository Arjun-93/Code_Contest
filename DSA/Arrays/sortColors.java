package DSA.Arrays;

public class sortColors {
    public static void main(String[] args) {
        
    }
    public static int[] check(int[] nums){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        int[] ans = new int[nums.length];
        for(int i= 0; i<nums.length; i++){
            if(nums[i] == 0){
                count0++;
            } else if(nums[i] == 1){
                count1++;
            } else{
                count2++;
            }
        }

        for(int i=0; i<count0; i++){
            ans[i] = 0;
        }
        for(int i=count0; i<count0+count1; i++){
            ans[i] = 0;
        }
        for(int i=count0+count1; i<count0+count1+count2; i++){
            ans[i] = 0;
        }
        return ans;
    }
}
