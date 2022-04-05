class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // prepare
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int n = 0; n < nums2.length; n++) {
            map.put(nums2[n], n);
        }

        // check
        for (int i = 0; i < nums1.length; i++) {
            int currValueIndex = map.get(nums1[i]);
            if (currValueIndex + 1 >= nums2.length) {
                result[i] = -1;
            } else {
                int nextValue = nums2[currValueIndex + 1];
                if (nextValue < nums1[i]) {
                    result[i] = -1;
                } else {
                    result[i] = nextValue;
                }
            }
        }
        return result;
    }
}
/*
Note:

         i
    [4,1,2]
    [1,3,4,2]
     {
        (1, 0),
        (3, 1),
        (4, 2),
        (2, 3),
     }

    two pointers or hashmap
    if either the biggest number or the last index, return -1
    else return next index value
    put nums2 in a map -- value, index
    int[] result = new int[nums1.length()];
    first:
            int currValueIndex = map.get(nums1[i]); // 2
            int nextValue = nums2[currValueIndex + 1]; // 2

            if nextValue < nums1[i] or
            nextValue == nums2.size() - 1
                return -1
*/
