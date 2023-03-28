package DSA.bitManipulation;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4};
        int[] ans = singleNumber(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
    public static int[] singleNumber(int[] nums){
        int[] arr = new int[2];
        int xorr = nums[0];
        int j = 0;
        for(int i=1; i<nums.length; i++){
            xorr ^= nums[i];
            System.out.println(xorr);
            if(xorr == 1){
                arr[j++] = nums[i];
                xorr = nums[i+1];
            }
        }
        return arr;
    }

    public static int[] findSingleNumber(int[] nums){
        int[] arr = new int[2];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i =0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(mp);
        int k = 0;
        for(int j=0; j<nums.length; j++){
            int temp = mp.get(nums[j]);
            if(temp==1){
                System.out.print(nums[j]);
                arr[k] = nums[j]; 
                k++;
            }
        }
        return arr;
    }
}
