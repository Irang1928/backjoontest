package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon2753 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if ((a%4==0 && a%100!=0) || a%400==0) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
}
