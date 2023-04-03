package DSA.Greedy;

public class NmeetingsRoom{
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        System.out.println(check(6,start,end));
    }

    public static int check(int N, int[] start, int[] end){
        int count = 0;
        int i =0;
        System.out.println(i+" ");
        for(int j= 1; j<N; j++){
            if(start[j]>=end[i]){
                i = j;
                count++;
            }
        }
        return count;
    }
}