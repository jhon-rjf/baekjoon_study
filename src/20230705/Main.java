import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = 0;
        
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] Aarrays = new int[m][n];
        int[][] Barrays = new int[m][n];
        int[][] Tarrays = new int[m][n]; 
     // Get A arrays value
   //  System.out.println("A arrays");
     for (int i = 0; i<m; i++){
        for (int o = 0; o<n; o++){
            int temp = sc.nextInt();
            Aarrays[i][o]= temp;
        }
     }
    // Get B arrays value
    // System.out.println("B arrays");
     for (int q = 0; q<m; q++){
        for (int w = 0; w<n; w++){
            int ttemp = sc.nextInt();
            Barrays[q][w]= ttemp;
        }
     }
    // plus arrays a, b
     //System.out.println("tot arrays");
    for (int e = 0; e<m; e++){
        for (int r = 0; r<n; r++){
            int a = Aarrays[e][r];
            //System.out.println("a?"+ a);
            int b = Barrays[e][r];
            //System.out.println("b?"+ b);
            int tot = a+b;
            //System.out.println("tot?"+ tot);
            Tarrays[e][r] = tot; 
        }
    }
    //Print
    for (int i = 0; i<m; i++){
        for (int o = 0; o<n; o++){
            int print = Tarrays[i][o];
            System.out.print(print+" ");
            if(o==n-1){
                System.out.println("");
            }
        }
    }

     //System.out.println(Arrays.deepToString(Tarrays));
    }
}