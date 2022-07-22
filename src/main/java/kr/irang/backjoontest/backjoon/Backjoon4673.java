package kr.irang.backjoontest.backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Backjoon4673 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ArrayList ar2 = new ArrayList();

        for (int i = 1; i <= 10000;i++) {
            String a = String.valueOf(i);
            String[] n = a.split("");
            int[] num = Arrays.stream(n).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(num).sum();
            ar.add(sum + i);
        }
        Collections.sort(ar);

        for (int i = 1; i <= 10000;i++) {
            if(ar.contains(i) == false) {
                System.out.println(i);
            }
        }
    }
}
