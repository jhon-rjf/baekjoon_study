

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
             for (int z = 0; z<strlength; z++){
                   boolean tr = (O[z].equals(OO)); //true
                   
                   System.out.println(z+1+"     1"+tr);
                   sum = sum+a;
                    System.out.println("   2 sum1 "+sum);
                    if ( tr ) { //OOXOXOOOXX (O[i].equals(new String"O")) = ture
                       if(z+1<strlength){
                         System.out.println("   3 z+1통과"); //exception 예외 
                        boolean tr1 = (O[z].equals(O[z+1])&&O[z].equals(OO)); //1번 2번 같아?
                         if (tr1){ // OOOXXOO
                System.out.println("   4 ==통과"); //에러: 더하기할때 2번3번이 같은경우 중복해서 들어간다는것, 하나짜리는 넘어가게끔 되어있는 로직 
                            a=a+1; // 2
                            //sum = sum+a;
                                 
                            //    System.out.println("sum2 "+sum);
                                System.out.println("   5 a "+a);
                            }else if (O[z].equals(OO)&&a>1){
                             sum = sum+1;
                              System.out.println("   6sum2 "+sum);
                                a = 1;
                            }else {
                                a = 1;
                                sum = sum-1;
                            }
        
         }   } else{
         sum=sum-1; 
         System.out.println("   7sum3 "+sum);}
             }  System.out.println("최종sum"+sum);
            //마지막 코멘트: 현재 x를 만났을때 그전 O에 대해서 대응이 안됨.
        }
        
    }
    
    
}