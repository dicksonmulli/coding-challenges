package hackerrank.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A left rotation operation on an array shifts each of the array's elements  unit to the left.
 * Done by Isaiah
 */
public class LeftRotation {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> b, int d) {
        int[] a = b.stream().mapToInt(i -> i).toArray();;
        int lenghtOfArray = a.length;

        // We want a copy of the original collection
        int[] copyArr = Arrays.copyOf(a, lenghtOfArray);

        for (int i = 0; i < lenghtOfArray; i++) {
            int newPos = (i + (lenghtOfArray - d)) % lenghtOfArray; // gets the position new position after rotation
            a[newPos] = copyArr[i]; // sets the new position of the current element
        }

        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}
