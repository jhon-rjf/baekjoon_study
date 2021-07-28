package baekjoon24;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon24 {
    public static void main (String[] args){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = A + B;
            String t = Integer.toString(i);
            bw.write("Case #" + t + ": " + A + " + " + B + " = " + C + "\n");
        }
        }catch(IOException e) {
            e.printStackTrace();
        }try{
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
