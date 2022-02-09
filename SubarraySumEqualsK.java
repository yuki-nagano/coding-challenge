class Solution {

    public int subarraySum(int[] nums, int k) {
        /*
            i
         [1,1,1] k = 2
              j
       */

        Map<Integer, Integer> map = new HashMap<>();
        map.put(k, 0); // 2, 1
        int j = 1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(k, map.get(k) + 1);
            } else if (j < nums.length) {
                if (map.containsKey(nums[i] + nums[j])) {
                    map.put(k, map.get(k) + 1);
                }
            }
            j++;
        }
        return map.size();
    }
}


"""
pseudo code
O(n^2)
    [-1, 4, 3, 1] = 2   # K = 3
      i  j
    subarrays_total = 1
    loop thru nums i
        loop thru nums j
            if i+j is k
                subarrays_total++
            elif i == k or j == k
                subarrays_total++
            i++
            j++
    return subarrays_total

    adding to map?
    {
    -1,
    4,
    3,
    1
    }

    [-1, 4, 3, 1] = 2   # K = 3
         i  i+1
"""
