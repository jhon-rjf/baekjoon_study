package baekjoon26;

import java.io.*;

public class baekjoon26 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int N = Integer.parseInt(br.readLine());
            for (int i = 1; i <= N; i++) {
                for (int p = N-1; p >= i; p--) {
                    bw.write(" ");
                }
                for (int o = 1; o <= i; o++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }try { bw.flush();} catch (IOException e) { e.printStackTrace();}
    }
}
