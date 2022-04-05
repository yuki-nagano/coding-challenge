class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = target - nums[i];
            if (map.containsKey(sum)) {
                return new int[] {map.get(sum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

/*
    Past attempt

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        map.put(i, nums[i]);
    }

    // [3,2,4] 6
    // 0:3, 1:2, ...
    // 6-3 3

    for (int i = 0; i < nums.length; i++) {
        int secondTarget = target - nums[i];
        if (map.contains(secondTarget) && (map.get(secondTarget) != i)) {
            return new int[]{map.get(n), map.get(secondTarget)};
        }
    }
    return new int[]{};
}
 */