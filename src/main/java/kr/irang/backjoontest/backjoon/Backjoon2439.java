package kr.irang.backjoontest.backjoon;

import java.io.*;

public class Backjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0;i < n;i++) {
            int a = n - i;
            while (a != 1) {
                a--;
                bw.write(" ");
            }
            for (int j = 0;j <= i;j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
