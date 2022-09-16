package Array_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class Rotate2dAraay_Clockwise {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		        
        int arr[][] = new int[2][2]; 
	    System.out.println("Enter 2d array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for(int j =0; j<arr[0].length; j++){
		       arr[i][j] = s.nextInt();   
            }
	    }
        
        int[][] rot = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            int k=1;
            for(int j =0; j<arr[0].length; j++){
		       rot[i][j] = arr[k--][i]; 
            }
	    
        }
        System.out.println("UnRotated Array : ");
        System.out.println(Arrays.deepToString(arr)+" ");
        System.out.println("Rotated Array : ");
        System.out.println(Arrays.deepToString(rot)+" ");
    }
}
