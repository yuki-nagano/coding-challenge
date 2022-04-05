class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0
        int j = nums.length - 1
        for (int n: nums) {
            if (n == val) {
                // Deletion
                j--;
                for (int k = i + 1; k < j; k++) {
                    nums[k - 1] = nums[k];
                }
            }
            i++;
        }
    }
}
/*
Note
    pre : nums = [3,2,2,3], val = 3
    post: 2, nums = [2,2,_,_]
    - remove val in place
    - elements can be returned in any order

          i
     [2,2,3,0]
          j


     // doesn't work
     1. if nums[i] is val change it into Max value and count that number
     2. sort
     3. change array size to nums.length - countVal

*/