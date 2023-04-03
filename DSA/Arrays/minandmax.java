package DSA.Arrays;

public class minandmax {
    public static void main(String[] args) {
        long[] nums = {3, 2, 1, 56, 10000, 167};
        pair check = find_min_max(nums);
        System.out.println(check.first+" "+check.second);
    }

    public static pair find_min_max(long[] nums){
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i= 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        pair ans = new pair(min, max);
        return ans;
    }
}

class pair{
    long first, second;
    public pair(long first, long second){
        this.first = first;
        this.second = second;
    }
}
