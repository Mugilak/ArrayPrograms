package Array_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class matrixFunctions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n and m size for n*m matrix");
        int n= s.nextInt();
        int m= s.nextInt();

        int[][] arr = new int[n][m];
        int[][]ans =new int[n][m];

        System.out.println("Enter "+n+" * "+m+" matrix elements : ");
        for(int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                arr[i][j] = s.nextInt();   
            }
        }

        // System.out.println("\nTranspose : "+Arrays.deepToString(TransposeArray(arr,ans)));
        
        System.out.println("\nAdjoint Array of an  Array : "+Arrays.deepToString(AdjointArray(arr,n, m,ans)));

    }

    
    private static int[][] AdjointArray(int[][] arr, int row, int col, int[][] adj) {
        int[][] cofactor = new int[row][col];
        int[][] A = new int[row][col];
        int sign;
        if(row==col){
            if(row == 1){ 
                adj[0][0]=1;
            }

            else if(row == 2){    
                int si=-1;
                int temp = adj[0][0];                           // 2*2 matrix
                adj[0][0]= adj[1][1];
                adj[1][1] =temp;
                adj[0][1] =si * adj[0][1];
                adj[1][0] =si * adj[1][0];
            }

            else{                                                       // 3*3 matrix
                for(int i=0; i<row; i++){
                    for(int j=0; j<col; j++){
                        findCofactor(arr, i, j,row,cofactor);

                        if((i+j)%2 == 0){
                            sign = 1;
                        }
                        else sign = -1;

                        int det = determinantOf_2cross2(cofactor);
                        // System.out.println(det);
                        A[i][j] = (sign) * det;
                    }
                }
                adj = TransposeArray(A, adj);
            }                                                     
        }

        return adj;
    }

    private static int determinantOf_2cross2(int[][] cofactor) {
        int l,r ;
        l = cofactor[0][0] * cofactor[1][1];
        r = cofactor[0][1] * cofactor[1][0];
        // System.out.println(cofactor[0][0]+" "+cofactor[1][1]+" "+l+" "+r+" "+(l-r));
        return l-(r);
    }


    private static void findCofactor(int[][] arr, int i1, int j1, int row,int[][] cofactor) {
        int x = 0, y, count=0;;
        for(int i=0; i<row; i++){
            y=0;
            for(int j=0; j<row; j++){
                if(i != i1){
                    if(j != j1){
                        cofactor[x][y] = arr[i][j];
                        // if(i1 == 1 && j1 ==1){
                        // System.out.println(cofactor[x][y]);}
                        y++;
                        count++;
                    }
                }
            }
            if(count == 2){
                x++;
                count=0;
            }
        }
    }


    private static int[][] TransposeArray(int[][] arr, int[][] ans) {
        for(int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                ans[i][j] =  arr[j][i]; 
            }
        }
        return ans;
    }
}
