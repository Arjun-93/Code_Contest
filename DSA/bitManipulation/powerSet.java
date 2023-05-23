package DSA.bitManipulation;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class powerSet {
    public static void main(String[] args) {
        
    }
    public static List<String> check(String str){
        double x = Math.pow(2, str.length());
        List<String> powerSet = new ArrayList<>();
        for(int i =1; i<(int)x; i++){
            String st  = "";
            int k = i;
            String bstr = Integer.toBinaryString(k);
            int l =bstr.length();
            int j = 0;
            while(l>0){
                if(bstr.charAt(l) == '1'){
                    st = st + str.charAt(j);
                }
                j++;
                l--;
                k = k>>1;
            }
            powerSet.add(st);
        }
        Collections.sort(powerSet);
        return powerSet;
    }
}
