class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // 1 <= nums[i] <= 100
        int pairs = 0;
        for (int i: nums) {
            freq[i]++;
        }

        for (int j: freq) {
            if (j > 1) {
                pairs += j * (j - 1) / 2;
            }
        }
        return pairs;
    }
}
/*
Note:
    n * (n – 1) / 2 : conbinatiorial
    find frequency and sum them up
    [0,0,1]
*/