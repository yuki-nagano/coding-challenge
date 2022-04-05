class Solution {
    public int[] frequencySort(int[] nums) {
        int[] frequency = new int[200]; // note: -100 <= nums[i] <= 100
        int[] result = new int[nums.length()];
        for (int i: nums) {
            frequency[i + 100]++;
        }

        int k = 0;
        for (int j : frequency) {
            if (j != 0) {
                if (index)
            }
        }
    }
}
/*
note:
    - put the frequency to the index of the number in array
    - sort the array!
    - loop thru the array and add them x frequency (if 0, skip)
    - how do you deal with the negative numbers--- start from -100 as index 0

        [-1,1,-6,4,5,-6,1,4,1]
                     -100, -99, <- frequency[i + 100]++!!!
        frequency = []
                     -6  -5    -1
                     94, 95 ... 99, 100, 101,
        frequency = [2 , 0 ,  , 1 ,  0 ,  3, ...]
*/