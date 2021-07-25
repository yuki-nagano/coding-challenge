class Solution {
    public int searchInsert(int[] nums, int target) {

        int pivot = nums.length / 2;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (target == nums[pivot]) {
                return pivot;            //
            } else if (pivot < target) { // use right half
                low = pivot;
                pivot = high / 2;
            } else if (target < pivot) { // use left half
                high = pivot;
                pivot = high / 2;
            }
        }
    }
}

/*
Note:
    time complexity: O(logn) -> binary search
    1. get the pivot index (nums.length / 2, 4=2, 3=1)
    2. while (pivot < nums.length)
        if target == pivot element, return
            else if pivot < target, search left half
            else if target < pivot, search right half
    3. (if couldn't find the target)
       return 0

   get the pivot from the right half
       0123456
   ex1 1356789 t=8 h=6, l=3 p=5
          l  h
            p

*/