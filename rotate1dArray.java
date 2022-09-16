package Array_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class rotate1dArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
                    
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
                    
        int arr[] = new int[n]; 
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();   
        }
        System.out.println("Enter how many elements to be rotated : ");
        int d = s.nextInt();

        int[]  ans= new int[n];

        System.out.println(Arrays.toString(LeftRotate(arr,d,n)));
        System.out.println(Arrays.toString(RightRotate(arr,d,n)));
        System.out.println("Reversal Left Rotate : "+Arrays.toString(ReversalLeftRotate(arr,d,n,ans)));
        System.out.println("Reversal Right Rotate : "+Arrays.toString(ReversalRightRotate(arr,d,n,ans)));
        System.out.println("Block Left Rotate : "+Arrays.toString(BlockLeftRotate(arr,d,n)));
        System.out.println("Block Right Rotate : "+Arrays.toString(BlockRighttRotate(arr,d,n)));
    }
   static public int[] BlockRighttRotate(int[] arr, int d, int n) {
        int A = n-d, B= d;
        while(A!=B){
            if(B>A){      // B lesser
                swap(arr, (n-d)-A, n-d+A, A);
                B -= A;                   // B=B-A
            }
            if(A>B){          // A greater
                swap(arr, (n-d)-A, n-d, B);
                A -= B;                   //A=A-B
            }
        }
        swap(arr, (n-d)-A, n-d, A);
        return arr;
    }
    private static int[] BlockLeftRotate(int[] arr, int d, int n) {
        int A = d, B= n-d;
        while(A!=B){
            if(A<B){
                swap(arr, d-A, A-d+B, A);
                B -= A;                   // B=B-A
            }
            else{
                swap(arr, d-A, d, B);
                A -= B;                   //A=A-B
            }
        }
        swap(arr, d-A, d, B);
        return arr;
    }

    private static void swap(int a[], int i1, int i2, int n){
        for (int i = 1; i <= n; i++) {
            int temp = a[i1];
            a[i1] = a[i2];
            a[i2] =temp;
            i1++; i2++;
        }
    }


    private static int[] ReversalLeftRotate(int[] arr, int d, int n, int[] ans) {
        int j1 = d-1;
        
            for(int j=0; j<d; j++){
                ans[j]=arr[j1];
                j1 += 1;
            }   
            j1=n-1;
            for(int j=d; j<n; j++){
                ans[j]=arr[j1--];
            }
            j1 = n-1;
            for(int j=0; j<n; j++){
                arr[j]=ans[j1--];
            }
        
        return arr;
    }
    private static int[] ReversalRightRotate(int[] arr, int d, int n, int[] ans) {
        int j1 = n-1;
        for(int i=0; i<n;i++){
            ans[i] = arr[j1--];
        }
        j1 = d-1;
        for(int i=0; i<d ;i++){
            arr[i] = ans[j1--];
        }
        j1 = n-1;
        for(int i=d; i<n;i++){
            arr[i] = ans[j1--];
        }
        return arr;
    }
    public static int[] LeftRotate(int[] arr, int d, int n){
        int rotating_i; 
        for(int i=0; i<d; i++){
            rotating_i = arr[0];
            for(int j=0; j < n-1; j++){
                arr[j] = arr[j+1];
                if(j == n-2){
                    arr[j+1] = rotating_i;
                }
            }
        }
        return arr;
    }
    public static int[] RightRotate(int[] arr, int d, int n){
        int rotating_i; 
        for(int i=0; i<d; i++){
            rotating_i = arr[n-1];
            for(int j=n-1; j > 0; j--){
                arr[j] = arr[j-1];
                if(j == 1){
                    arr[j-1] = rotating_i;
                }
            }
        }
        return arr;
    }
}
