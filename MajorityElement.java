class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) >= Math.ceil(nums.length / 2.0)) {
                    return nums[i];
                }
            }
        }
        return nums[0]; // this part
    }
}
/*
Note:
    - could possibly use map and check the values the most
    - majority element number holds more than half of the array
    - put into map and count the number, if map.get(nums[i]) > n/2),
      return that value, otherwise keep
*/