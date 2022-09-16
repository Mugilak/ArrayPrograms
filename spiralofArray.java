package Array_Programs;
import java.util.Scanner;
public class spiralofArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter n and m size for n*m matrix");
        int n= s.nextInt();
        int m= s.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter "+n+" * "+m+" matrix elements : ");
        for(int i = 0; i < arr.length; i++) {
            for(int j=0 ; j<arr[0].length; j++){
                arr[i][j] = s.nextInt();   
            }
        }
        SpringArray(arr);
    }
    private static void SpringArray(int[][] arr) {
        int rb= 0, cb=0, dir=1;
        int row =arr.length;
        int re = arr.length - 1;
        int ce = arr[0].length -1;
        for(int i = 0; i < (row*2)-1; i++){
            if(dir==1){
                for(int j=cb; j<=ce; j++){
                    System.out.print(arr[rb][j]+" ");
                }
                rb++;
                dir++;
            }
            else if(dir==2){
                for(int j=rb; j<=re;j++){
                    System.out.print(arr[j][ce]+" ");
                }
                ce--;
                dir++;
            }
            else if(dir==3){
                for(int j=ce;j>=cb;j--){
                    System.out.print(arr[re][j]+" ");
                }
                re--;
                dir++;
            }
            else if(dir==4){
                for(int j=re; j>=rb; j--){
                    System.out.print(arr[j][cb]+" ");
                }
                cb++;
                dir=1;
            }
        }
    }
}
