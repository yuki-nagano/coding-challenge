class Solution {
    public int singleNumber(int[] nums) {
        // input: [2,2,1]
        // output: 1 (1 is a single number)
        // time:  O(n)
        // space: O(1)

        // loop though the array
        int[] copied = new int[nums.legnth];
        System.arraycopy(nums, 0, copied, 0, nums.legnth);

        while (nums.length > 1) {
            for (int n : nums) {

            }
        }
    }
}