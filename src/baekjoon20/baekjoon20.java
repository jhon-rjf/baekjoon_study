package baekjoon20;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon20 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 0;
        try {
            T = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < T; i++) {
            StringTokenizer st = null;
            try {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                String c = Integer.toString(a + b);

                bw.write(c + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}