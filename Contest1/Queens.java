import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    arr[j][k] = 0;
                }
            }

            if(nQueens(arr,0,n)){
                for(int j=0; j<n; j++){
                    for(int k=0; k<n; k++){
                        System.out.print(arr[j][k]+" ");
                    }
                    System.out.println();
                }
        }
        else{
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    System.out.print(arr[j][k]+" ");
                }
                System.out.println();
            }}}
        }

    public static boolean isSafe(int [][]arr, int x, int y, int n){
        for(int row=0; row<x; row++){
            if(arr[row][y] == 1){
                return false;
            }
        }
        int row = x;
        int col = y;
        while(row>=0 && col>=0){
            if(arr[row][col] == 1){
                return false;
            }
            row--;
            col--;
        }

        row = x;
        col = y;
        while(row>=0 && col<n){
            if(arr[row][col] == 1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }

    public static boolean nQueens(int [][]arr, int x, int n){
        if(x>=n){
            return true;
        }
        for(int col=0; col<n; col++){
            if(isSafe(arr, x, col, n)){
                arr[x][col] = 1;
                if(nQueens(arr, x+1, n)){
                    return true;
                }
                arr[x][col] = 0; //backtrack
            }
        }
        return false;
    }
}
