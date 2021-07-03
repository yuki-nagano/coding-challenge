class Solution {
    public int removeDuplicates(int[] nums) {
        // input: [1,1,2]
        // output: 2 [1,2] number of the unique elements

        // loop through nums
        // if the element exists in nums, remove the array and i--
        // otherwise, keep going
        //    i
        // [1,1,2]
        // []

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                nums[i] = "_"; // how to delete
            } else {
                set.add(nums[i]);
            }
        }
    }
}