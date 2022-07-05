package kr.irang.backjoontest.backjoon;

import java.util.Scanner;

public class Backjoon2525 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = b + c;
        int sum2 = sum / 60;
        int sum3 = sum / 60 * 60;
        if (sum >= 60) {
            if (a + sum2 >= 24) {
                System.out.println((a + sum2 - ((a + sum2) / 24 * 24)) + " " + (sum - sum3) );
            }
            else if (a + sum2 < 24) {
                System.out.print((a + sum2) + " " + (sum - sum3));
            }
        }
        else if (sum < 60){
            System.out.print(a + " " + sum);
        }
    }
}
