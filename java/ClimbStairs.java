class Solution {

    public Map<Integer, Integer> cache = new HashMap<>();
    public int result = 0;

    public int climbStairs(int n) {
        // recursion + memoization
        /**
         n = 2
         2
         -1   /      \  -2
         1        0  <- base case; dest reached = +1
         /   \
         0     -1 <- base case; out of bounds = 0
         **/

        // check cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Base:
        //       if dest reached, +1
        //       if out of bounds, 0
        //   otherwise:
        //       recurse and pass n+1 or n+2
        if (n == 0) {
            return result++;
        } else if (n < 0) {
            return result;
        } else {
            result = climbStairs(n - 1) + climbStairs(n - 2);
        }
        // store to cache
        cache.put(n, result);
        return result;
    }
}