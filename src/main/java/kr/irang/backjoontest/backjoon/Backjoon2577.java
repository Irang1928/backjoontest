package kr.irang.backjoontest.backjoon;

import java.io.*;

public class Backjoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = a * b * c;
        String x2 = String.valueOf(x);
        char[] n = x2.toCharArray();
        char[] n2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0;i < n2.length;i++) {
            int num = 0;
            for (int j = 0; j < n.length; j++) {
                if (n[j] == n2[i]) {
                    num++;
                }
            }
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}
