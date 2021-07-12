package baekjoon9 ;
import java.util.Scanner;
public class baekjoon09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        sc.close();
    }
}