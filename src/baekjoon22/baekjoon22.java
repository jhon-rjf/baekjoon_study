package baekjoon22;

import java.io.*;

public class baekjoon22 {
    public static void main (String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int N = Integer.parseInt(br.readLine());
            for (int i = N; i >= 1; i--){
                String O = Integer.toString(i);
                bw.write(O+"\n");
            }
            bw.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}