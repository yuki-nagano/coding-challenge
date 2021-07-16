class Solution {
    public int singleNumber(int[] nums) {
        // sort
        Arrays.sort(nums); // O(nlogn)
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1]; // return the last one
    }
}

/*
    Note:
        2 pointers?
        start:
        i = 0
        j = i + 1
        if (nums[j]== nums[i]) {
         remove numsj and numsi
         0 1 2
        [1,2,1,2,4]
         i
           j

        [1,1,2,4,4]
             i
*/