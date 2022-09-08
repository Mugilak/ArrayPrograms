package Array_Programs;
import java.util.Scanner;
public class grandChildren {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // System.out.println("enter no. of sons and family size : ");
        // int row = s.nextInt();
        // int col = s.nextInt();

        String[][] fam= {{"luke", "shaw"},{"wayne", "rooney"},{"rooney", "ronaldo"},{"Shaw","rooney"}};


        System.out.println("Enter the person Name whom's grandchildren you need to find");
        String person = s.next();

        String son;
        int GrandSon=0, Son=0;

        for(int i=0;i<fam.length;i++) {
            if(fam[i][1].equalsIgnoreCase(person)){
                Son++;
                son = fam[i][0];
                for(int j=0; j<fam.length; j++){
                    if(son.equalsIgnoreCase(fam[j][1])){
                        GrandSon++;
                    }
                }
                if(GrandSon!=0){
                    System.out.println(GrandSon+ " GrandSon");
                }
            }
        }
        if(Son==0||GrandSon==0) System.out.println(GrandSon+ " GrandSon");
    }
}
