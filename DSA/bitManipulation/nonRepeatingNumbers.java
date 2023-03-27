package DSA.bitManipulation;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

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
        int count =1;
        for (int i =0; i<nums.length; i++){
            if()
        }


        return arr;
    }
}
