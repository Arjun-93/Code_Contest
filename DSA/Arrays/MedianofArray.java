package DSA.Arrays;

public class MedianofArray {
    public static void main(String[] args) {
        
    }
    public static int findMedian(int [] nums, int N){
        // Arrays.sort(nums);
        if(N%2 ==0){
            return ( nums[N/2] + nums[N/2+1])/2;
        } else{
            return nums[N/2];
        }
    }
}
