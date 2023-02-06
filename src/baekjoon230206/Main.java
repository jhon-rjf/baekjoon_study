

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번이나:");
        int Count = sc.nextInt();
        String Q [] = new String[Count];
        int sum = 0;
        int summ = 0;
        int a = 1;
        String OO = new String("O");
        for (int i = 0; i<Count; i++){
            String ox = sc.next();
            int strlength = ox.length();
        String O [] = new String[strlength];
                O = ox.split("");
             System.out.println(Arrays.toString(O)); //array에 하나씩 등록가능하게 함. arr[1] = O arr[2] =X 처럼.
         if ((O[i].equals(OO)) = "ture" ) { //OOXOOOXX (O[i].equals(new String"O")) = ture
            if (O[i] == O[i+1]){
                
                sum = sum+a; // 0 , 0+1=1
                a=a+1; // 2
                
                System.out.println("sum"+sum);
                System.out.println("a"+a);
            }else {
            sum = sum+a; //3
             a = 1;
            }
        
         }       System.out.println("최종sum"+sum);
            
            
        }
        
    }
    
    
}