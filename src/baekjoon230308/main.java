import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        // System.out.println("T");
        T = sc.nextInt();
        int R = 0;
        for (int i = 0; i < T; i++) {
            // System.out.println("R");
            R = sc.nextInt();
            // System.out.println("S");
            String S = "";
            S = sc.next();
            int Counts = S.length();
            String[] O;
            O = new String[Counts];
            O = S.split("");
            for (int z = 0; z < Counts; z++) {
                for (int o = 0; o < R; o++) {
                    System.out.print(O[z]);
                }
            }
        }
    }
}

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            String[] chars = S.split("");
            for(int j = 0; j < chars.length; j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(chars[j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

와 이건 뭐 chatgpt가 짜준 코드. */