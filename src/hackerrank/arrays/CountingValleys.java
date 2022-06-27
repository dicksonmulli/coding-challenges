package hackerrank.arrays;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int v = 0;     // Number of of valleys
        int lvl = 0;   // current level
        for(char c : path.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U') {
                ++v;
            }
        }
        return v;
    }
}
