package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon9498 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.print("A");
        }
        else if (a < 90 && a >= 80) {
            System.out.print("B");
        }
        else if (a < 80 && a >= 70) {
            System.out.print("C");
        }
        else if (a < 70 && a >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}
