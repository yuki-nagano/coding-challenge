package solutions;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueNumber {

    /**
     * findUniqueNumber
     *
     * @param array
     * @return the number of unique numbers
     */
    public static int findUniqueNumber(int[] array) {

        // pre : 1,1,2,3
        // post: 3(1,2,3)

        // case 1: 1,2,3,4,4
        // case 2: null
        // case 3: []
        // case 4: 1

        // O(N)
        if (array == null || array.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        return set.size();
    }
}
