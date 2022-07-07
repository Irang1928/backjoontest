package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i < n;i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        bw.write(ar[0] + " " + ar[ar.length-1] );
        bw.flush();
        bw.close();
    }
}
