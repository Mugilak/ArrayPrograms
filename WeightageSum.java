package Array_Programs;
import java.util.Scanner;
public class WeightageSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        
        int arr[] = new int[n]; 
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();   
        }

        int weight[] = new int[n];
        double sqrt ;

        for(int i= 0; i<n; i++){
            weight[i] = 0;
            if(arr[i]%2 == 0){
                weight[i] += 3;
            }
            if((arr[i]%4 == 0) && (arr[i]%6==0)){
                weight[i] += 4;
            }
            if(Math.sqrt(arr[i]) - Math.floor(Math.sqrt(arr[i])) == 0){
                weight[i] += 5;
            }
        }

        int temp;
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1; j>0; j--){
                if(weight[j-1]<weight[j]){
                    temp=weight[j];
                    weight[j]=weight[j-1];
                    weight[j-1]= temp;

                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }   
        }
        for(int i=0; i<n; i++)
            System.out.print("<"+arr[i]+","+weight[i]+">  ");

    }
}
