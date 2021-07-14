package baekjoon13;

import java.util.Scanner;

public class baekjoon13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        A=sc.nextInt();
        sc.close();

        if (100 >= A && A >= 90) {
            System.out.println("A");
        } else if (89 >= A && A >= 80) {
            System.out.println("B");
        } else if (79 >= A && A >= 70) {
            System.out.println("C");
        } else if (69 >= A && A >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
