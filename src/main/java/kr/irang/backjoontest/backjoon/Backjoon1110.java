package kr.irang.backjoontest.backjoon;

import java.io.*;

public class Backjoon1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int i = 0;
        if (a < 10) {
            a *= 10;
        }
        int n = a;
        while (true) {
            i++;
            n = (n % 10) * 10 + (((n / 10) + (n % 10)) % 10);
            if (a == n) {
                bw.write(i + "");
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
