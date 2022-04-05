class Solution {
    public boolean canPartition(int[] nums) {
        return true;
    }
}
/*
Note:
    either 2:2 or 1:3
    ex1: [1,5,9,5]

            ""
        /       \
    1+5, 9+5   1+9, 5+5 <-
    /    \
    recurse until key and value are the same

    ex2: [1,5,12,5,1]

                 1
          /                \
       1+5                 5+12
       /
   1+5+12

*/