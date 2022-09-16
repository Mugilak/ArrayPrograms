package Array_Programs;
import java.util.Scanner;
public class saddlePoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[3][3]; 
        // int arr2[][] = new int[2][3];

        System.out.println("Enter 3 * 3  array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                arr[i][j] = s.nextInt();   
            }
        }
        System.out.println(findSaddle(arr));  
    }

    public static int findSaddle(int[][] arr){
        int min, j_col,count; 
        int row = arr.length, col= arr[0].length;
        for (int i = 0; i < row; i++) {
            min = arr[i][0];
            j_col = 0;
            count = 0;
            for(int j=0 ; j<col; j++){
                if(min > arr[i][j]) {            // to find minimum value in each row
                    min = arr[i][j];
                    j_col = j;
                }
            }
            
            for(int k =0; k<row; k++){
                if(min < arr[k][j_col]){     // to know min is maximum in its column wise
                    count ++;                       // small elements come into this body 
                }
            }

            if(count == 0){
                return min;
            }
        }
        return 0;
    }
}
