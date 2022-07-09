package kr.irang.backjoontest.backjoon;

import java.io.*;
import java.util.Arrays;

public class Backjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ar = new int[10];         // 값을 입력받을 배열
        int[] ar2 = new int[10];        // 중복을 제거한 값을 저장할 임시 배열
        int j = 0;                      // 참조할 인덱스 값
        for (int i = 0;i < ar.length;i++) {
            ar[i] = (Integer.parseInt(br.readLine())) % 42;
        }
        Arrays.sort(ar);
        for (int i = 0;i < ar.length - 1;i++) {     // 연속하는 두 수를 비교하여 다를 경우 배열에 저장
            if (ar[i] != ar[i + 1]) {
                ar2[j++] = ar[i];
            }
        }
        ar2[j++] = ar[ar.length - 1];   // 위의 for문에서 비교하지 못한 마지막 값 저장
        int[] ar3 = new int[j];         // 크기에 맞는 배열 선언
        for (int i = 0;i < j;i++) {
            ar3[i] = ar2[i];            // 임시 배열의 값을 크기에 맞는 배열에 저장
        }
        bw.write(ar3.length + "");
        bw.flush();
        bw.close();
    }
}
