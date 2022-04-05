class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> findDuplicates(int[] nums) {

        if (nums.length == 1) return result;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) == 2) {
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }
}