package DSA.Arrays;

public class moveAllNegative {
    public static void main(String[] args) {
        
    }

    public static void moveNeagtive(int[] arr){
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];

        int j = 0;
        int k = 0;
        for(int i=0; i<n ; i++){
            int temp = arr[i];
            if(temp<0){
                neg[j++] = temp;
            } else{
                pos[k++] = temp;
            }
        }
        for(int i=0; i<pos.length; i++){
            arr[i] = pos[i];
        }
        int l = 0;
        for(int i=pos.length; i<n; i++){
            arr[i] = neg[l++];
        }
    }
}
