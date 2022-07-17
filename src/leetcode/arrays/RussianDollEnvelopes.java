package leetcode.arrays;

import java.util.Arrays;

/**
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents
 * the width and the height of an envelope.
 * One envelope can fit into another if and only if both the width and height of
 * one envelope are greater than the other envelope's width and height.
 *
 * Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
 */
public class RussianDollEnvelopes {
    public static void main(String[] args) {
        int[][] envs = {{5,4},{6,4},{6,7},{2,3}};
//        System.out.println("max " + maxEnvelopes(envs));
        solve();
    }


    public static void solve() {
        int ans = 0;

        System.out.println("max " + ans);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int maxEnv = 0;
        int[] newList = new int[envelopes.length];

        for (int[] env: envelopes) {
            int height = env[1];
            System.out.println("height: " + height);
            System.out.println("maxEnv: " + maxEnv);
            int left = Arrays.binarySearch(newList, 0, maxEnv, height);
            System.out.println("left: " + left);
            if (left < 0) {
                left = -left - 1;
            }
            if (left == maxEnv) {
                maxEnv++;
            }
            newList[left] = height;
        }
//        Arrays.stream(envelopes)
//                .map(entity -> )
//                .toList();
        return maxEnv;
    }
}
