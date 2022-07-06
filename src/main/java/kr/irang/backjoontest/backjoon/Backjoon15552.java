package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Backjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0;i < t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());    // 입력 받기
            int a = Integer.parseInt(st.nextToken());   // 첫번째 입력받은 숫자 넣기
            int b = Integer.parseInt(st.nextToken());   // 두번째 입력받은 숫자 넣기
            bw.write(a + b + "\n");     // 출력
        }
        bw.flush();     // 스트림 비우기
        bw.close();
    }
}
