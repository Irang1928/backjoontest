package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon2884 {
    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        if (h < 24 && m >= 45) {
            System.out.print(h + " " + (m - 45));
        }
        else if (h != 0 && h < 24 && m < 45) {
            System.out.print((h-1) + " " + (m + 15));
        }
        else if (h == 0 && m < 45) {
            System.out.print("23 " + (m + 15));
        }
    }
}
