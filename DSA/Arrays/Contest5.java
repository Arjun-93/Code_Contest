
package DSA.Arrays;
public class Contest5 {


    public int neitherminnormax(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != min && nums[i] != max){
                ans = nums[i];
            }
        }
        if(ans == 0){
            return -1;
        }
        else{
            return ans;
        }
    }
    public class LexicographicallySmallestString {
        public static String getLexicographicallySmallestString(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
    
            // Find the first non-'a' character from the left
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 'a') {
                    idx = i;
                    break;
                }
            }
            if (idx == -1)
                arr[n - 1] = 'z';
            else {
                for (int i = idx; i < n; i++) {
                    if (arr[i] != 'a')
                        arr[i] = (char) (arr[i] - 1);
                }
            }
    
            return new String(arr);
        }
    
        public static void main(String[] args) {
            String s = "cbabc";
            System.out.println(getLexicographicallySmallestString(s));
    
            s = "leetcode";
            System.out.println(getLexicographicallySmallestString(s));
        }
    }

    public int lengthOfLongestWord(String str){
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }
        return max;
    }
}
