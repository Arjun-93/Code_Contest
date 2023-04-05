package DSA.Arrays;
public class getMinDIff {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 2;
        int n = nums.length;
        int maxheight = Arrays.stream(nums).min().getAsInt();
        int minHeight = Arrays.stream(nums).max().getAsInt();;
        int initialDiff = maxheight - minHeight;
        int avgHeight = (maxheight + minHeight)/2;

        for (int i=0; i<n; i++){
            if(nums[i] <= avgHeight){
                nums[i] += k;
            }
            else{
                nums[i] -= k;
            }
        }
        int newMinHeight = Arrays.stream(arr).min().getAsInt();
        int newMaxHeight = Arrays.stream(arr).max().getAsInt();
        int newDiff = newMaxHeight - newMinHeight;

        if(newDiff > initialDiff){
            return initialDiff;
        } else {
            return newDiff;
        }
    }
}
