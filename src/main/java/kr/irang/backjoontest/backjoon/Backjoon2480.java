package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon2480 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && b == c) {
            System.out.print(10000 + a * 1000);
        }
        else if (a == b && a != c) {
            System.out.print(1000 + a * 100);
        }
        else if (a == c && a != b) {
            System.out.print(1000 + a * 100);
        }
        else if (b == c && a != b) {
            System.out.print(1000 + b * 100);
        }
        else {
            if (a > b && a > c) {
                System.out.print(a * 100);
            }
            else if (b > a && b > c) {
                System.out.print(b * 100);
            }
            else {
                System.out.print(c * 100);
            }
        }
    }
}
