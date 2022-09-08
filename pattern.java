package Array_Programs;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = s.next();
        
        int n = str.length();

        if((n%2) != 0){

            for(int i=0; i<n; i++){

                for(int j=0; j<n; j++){

                    if(i==j){
                        System.out.print(str.charAt(i));
                    }
                    else if((i+j)==(n-1)){
                        System.out.print(str.charAt(j));
                    }
                    else System.out.print(" ");

                }
                System.out.println();
            }
        }

        else System.out.print("0"); 
    }
}



/*
 * OUTPUT OF THE PROGRAM
 * 
 *    PROGRAM
 * 
 * P     M
    R   A 
     O R  
      G   
     O R  
    R   A 
   P     M
 */