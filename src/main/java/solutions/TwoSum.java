package solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Two Sum
     *
     * @param nums
     * @param target
     * @return index of two numbers
     */
    public static int[] twoSum(int[] nums, int target) {

        // pre : 12345, 6
        // post: 0,4
        // single loop O(n)
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

        // brute force O(n^2)
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;

