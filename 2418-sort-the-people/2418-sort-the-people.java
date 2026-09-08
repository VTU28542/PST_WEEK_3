import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Integer[] indexes = new Integer[names.length];

        // Store indexes
        for (int i = 0; i < names.length; i++) {
            indexes[i] = i;
        }

        // Sort indexes by height (descending)
        Arrays.sort(indexes, (a, b) -> heights[b] - heights[a]);

        // Create result
        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[indexes[i]];
        }

        return result;
    }
}
