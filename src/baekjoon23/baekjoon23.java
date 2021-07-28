package baekjoon23;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon23 {
    public static void main (String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            String O = Integer.toString(i);
            bw.write("Case #" + O + ": ");
            String P = Integer.toString(A + B);
            bw.write(P+"\n");

        }
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
