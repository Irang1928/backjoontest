package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon8393 {
    public static void main(String[] args) {
        int a;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1;i <= a;i++) {
            b += i;
        }
        System.out.print(b);
    }
}
