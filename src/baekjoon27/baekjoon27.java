package baekjoon27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon27 {
    public static void main(String[] args){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            int a[] = new int[N];
            a[i] = Integer.parseInt(br.readLine()); //배열에 저장

        }
    }
}
