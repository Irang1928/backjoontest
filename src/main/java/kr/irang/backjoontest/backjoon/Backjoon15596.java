package kr.irang.backjoontest.backjoon;

public class Backjoon15596 {
    long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
}
