package kr.irang.backjoontest.backjoon;

import java.io.*;

public class Backjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0;i < n;i++) {
            String str = String.valueOf(br.readLine());
            String[] ar = str.split("");
            int a = 0;
            int b = 0;
            int c = 0;
            for (int j = 0;j < ar.length;j++) {
                if (ar[j].equals("O")) {
                    a++;
                    b += a;
                }
                else if (ar[j].equals("X")) {
                    c += b;
                    a = 0;
                    b = 0;
                }
            }
            c += b;     // O로 끝날 경우 마지막 값 더해주기
            bw.write(c + "\n");
        }
        bw.flush();
        bw.close();
    }
}
