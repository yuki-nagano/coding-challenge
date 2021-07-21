class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int i = 0;
        int j = 1;

        //
        // 1M234MM
        //     i
        //        j
        while (j < nums.length){
            if (nums[i] == nums[j]) {
                k -= 1;
                nums[j] = Integer.MAX_VALUE;
                j++;
            } else {
                i = j;
                j++;
            }
        }
        Arrays.sort(nums); // O(nlogn)
        nums = new int[k];
        return k;
    }
}

/*
first attempt
        input: [1,1,2]
        output: 2 [1,2] number of the unique elements

        loop through nums
        if the element exists in nums, remove the array and i--
        otherwise, keep going
           i
        [1,1,2]
        []

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                nums[i] = "_"; // how to delete
            } else {
                set.add(nums[i]);
            }
        }
*/