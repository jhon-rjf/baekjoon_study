package baekjoon18;

import java.util.Scanner;

public class baekjoon18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
      //  System.out.println(T);


        for (int i = 1; i <= T; i++ ){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);

        }
        sc.close();
    }
}
