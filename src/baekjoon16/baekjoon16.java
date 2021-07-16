package baekjoon16;

import java.util.Scanner;

public class baekjoon16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
       if (H == 0 && M < 45){
           H = 24;
       }

        int m1 = H*60 + M;
        int m2 = m1 - 45;
        int m3 = m2 / 60;
        int m4 = m2 % 60;
        System.out.print(m3+" ");
        System.out.println(m4);
    }
}
