package hackerrank.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation
 * add a value to each the array element between two given indices, inclusive.
 * Once all operations have been performed, return the maximum value in the array.
 *
 * ** THE CURRENT SOLUTION IS NOT OPTIMAL, IT'S PASSING 6 TESTS AND FAILING ON THE REST **
 */
public class ArrayManipulation {
    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        Map<Integer, Integer> map = new HashMap<>();

        long max = 0;
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            for (int j = 0; j < n; j++) {
                if (map.containsKey(j)) {
                    // add the value and save in map
                    map.put(j, calculateCurrentMapValue(map, j, query, false));

                } else {
                    // save the key and value for the first time in map
                    map.put(j, calculateCurrentMapValue(map, j, query, true));
                }
            }

        }

        for (Integer entries: map.values()) {
            if (entries > max) {
                max = entries;
            }
        }

        return max;
    }

    private static int calculateCurrentMapValue(Map<Integer, Integer> map, int pos, List<Integer> query, boolean firstTime) {
        int mapValue = 0;
        if (!firstTime) {
            mapValue = map.get(pos);
        }

        if ((pos + 1) >= query.get(0) && (pos + 1) <= query.get(1)) {
            mapValue = mapValue + query.get(2);
        }
        return mapValue;
    }
}
