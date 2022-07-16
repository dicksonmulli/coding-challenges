package leetcode.arrays;

public class BinarySearch {
    /**
     * this method takes a sortedArray, key & the low & high indexes of the sortedArray as arguments
     *  When the method runs for the first time the low, the first index of the sortedArray, is 0
     * @param sortedArray MUST BE sorted array
     * @param key key that you are searching
     * @param low the first index of the array
     * @param high the last index of the array
     * @return
     */
    public int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
