package Array_Programs;
import java.util.Scanner;
public class multiplyTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[2][2]; 
        int arr2[][] = new int[2][3];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                arr[i][j] = s.nextInt();   
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                arr2[i][j] = s.nextInt();   
            }
            System.out.println();
        }
        int ans[][] = new int[arr[0].length][arr2.length];
        if((arr[0].length) == arr2.length){
            for(int i=0;i<arr.length;i++)
		    {
			    for(int j=0;j<arr2[0].length;j++)
			    {
				    ans[i][j]=0;
				
				    for(int k=0;k<arr[0].length;k++)
				    {
					    ans[i][j]+=arr[i][k]*arr2[k][j];
				    }								
			    }
		    }		
        }
        else System.out.println("not able to multiply this");
        
        for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(ans[i][j]+" ");
			System.out.println();
		}
    }
    
}
