package baekjoon19;

import java.util.Scanner;

public class baekjoon19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 1;
        int b = 0;
        int c = 0;
        for ( int i = 1; i <= n; i++){
            b=b+1;
            c = c+(a*b);
        }
        System.out.println(c);
    }
}
