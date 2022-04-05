class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}
/*
Note:
Input : nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Insertion
             i          j
    [1,2,4,5,5,0], [4,5,6]

    if i < j && i+1 >= j:
        result[i] = nums1[i]
        result[i+1] = nums2[j]
        j++;
    i++;
*/
