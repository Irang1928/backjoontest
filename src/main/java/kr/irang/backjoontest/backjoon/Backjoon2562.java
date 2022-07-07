package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.Arrays;

public class Backjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ar = new int[9];
        int[] ar2 = new int[9];
        for (int i = 0;i < 9;i++) {
            ar[i] = Integer.parseInt(br.readLine());
            ar2[i] = ar[i];
        }
        Arrays.sort(ar);
        bw.write(ar[ar.length - 1] + "\n");
        for (int i = 0;i < 9;i++) {
            if (ar2[i] == ar[ar.length - 1]) {
                bw.write(i + 1 + "");
            }
        }
        bw.flush();
        bw.close();
    }
}
