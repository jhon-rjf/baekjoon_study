package baekjoon11;
import java.util.Scanner;
public class baekjoon11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B ;
        A = sc.nextInt();
        B = sc.nextInt();

        int B1 = B%10;
        int B10 = (((B%100)-B1)/10);
        int B100 = (B-(B%100))/100;
        System.out.println(A*B1);
        System.out.println(A*B10);
        System.out.println(A*B100);
        System.out.println(A*B);
        sc.close();
    }
}
