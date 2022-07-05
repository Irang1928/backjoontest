package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon2739 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1 ; i < 10 ; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
