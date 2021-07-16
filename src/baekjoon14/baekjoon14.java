
package baekjoon14;

        import java.util.Scanner;

public class baekjoon14 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        if (A%4 == 0){
            if(A%100 == 0 && A%400 != 0){
                System.out.println("0"); return;

            } else if (A%100 == 0 && A%400 == 0){
                System.out.println("1"); return;
            }
            System.out.println("1");
        }else{
            System.out.println("0");
        }


    }
}