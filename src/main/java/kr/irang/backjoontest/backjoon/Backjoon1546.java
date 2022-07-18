package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double ave = 0;
        double[] score = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i < n;i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);
        for (int i = 0;i < n;i++) {
            score[i] = score[i] / score[score.length - 1] * 100;
            ave += score[i];
        }
        bw.write(ave / n + "");
        bw.flush();
        bw.close();
    }
}
