package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon10950 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];

        for (int i = 0;(i + 1) <= t;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int j = 0;(j + 1) <= t;j++) {
            System.out.println(a[j] + b[j]);
        }
    }
}
