package Array_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class alternatingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        
        int arr[] = new int[n]; 
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();   
        }

        Arrays.sort(arr);               // sorting the array     
        int mid = Math.round(n/2);      // finding middle value of array
    
        int cloneArr[] = Arrays.copyOf(arr, n);
        int len = n;
        if(n%2 == 0) {mid= mid -1 ;
            len =n-1;
        }
        int mid2 =mid;

        int k = 0;
        arr[k++]=cloneArr[mid];
        for(int i=0; i<=len/2; i++){

            if(mid>0 && k%2 == 0){
                mid = mid - 1;
                arr[k++] = cloneArr[mid];
            }
           
            if(mid2<n && k%2 != 0 && k<n){
                mid2 = mid2 + 1;
                arr[k++] = cloneArr[mid2];
            }
        }
        System.out.print("Alternated Array : ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");   
        }

    }
}
