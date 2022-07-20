package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Backjoon4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double[] ar2 = new double[n];
        for (int i = 0;i < n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int ave = 0;
            int[] ar = new int[t];
            for (int j = 0;j < t;j++) {
                ar[j] = Integer.parseInt(st.nextToken());
                ave += ar[j];
            }
            double t2 = 0;
            for (int j = 0;j < ar.length;j++) {
                if ((ave / t) < ar[j]) {
                    t2++;
                }
            }
            bw.write(String.format("%.3f", t2 / t * 100) + "%\n");
        }
        bw.flush();
        bw.close();
    }
}
