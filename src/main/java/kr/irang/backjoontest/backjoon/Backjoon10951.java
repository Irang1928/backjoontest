package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Backjoon10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (str.isEmpty()) { // 백준에서는 런타임 에러 -> str == null 사용
                break;
            }
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
