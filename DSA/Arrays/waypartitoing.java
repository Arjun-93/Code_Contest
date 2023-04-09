package DSA.Arrays;

public class waypartitoing {
    public static void main(String[] args) {
        
    }
    public void threeWayPartition(int array[], int a, int b)
        {
            // code here 
            int n = array.length;
            int start = 0;
            int end = n-1;
            for( int i =0; i<= end; i++){
                if( array[i] < a){
                    int temp = array[start];
                    array[start] = temp;
                    array[i] = temp;
                    start++;
                    
                } else if( array[i] > b){
                    int temp = array[end];
                    array[end] = temp;
                    array[i] = temp;
                    end--;
                }
            }
        }
}
