package hackerrank.arrays;

import java.util.List;

/**
 * Question: It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
 * Each person wears a sticker indicating their initial position in the queue from  to .
 * Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker.
 * One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order.
 * Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 */
public class NewYearBribeChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int totalNumberOfBribes = 0;
        int min = q.size();

        for (int i = q.size()-1; i >= 0 ; i--) {
            int initialValueAtCurrentPosition = i+1;
            int numberAtCurrentPosition = q.get(i);
            int bribes = numberAtCurrentPosition - initialValueAtCurrentPosition;
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (numberAtCurrentPosition > initialValueAtCurrentPosition) {
                totalNumberOfBribes += bribes;
            } else {
                if (min > numberAtCurrentPosition) {
                    min = numberAtCurrentPosition;
                } else if (numberAtCurrentPosition != min) {
                    totalNumberOfBribes ++;
                }
            }
        }

        System.out.println(totalNumberOfBribes);
    }
}
