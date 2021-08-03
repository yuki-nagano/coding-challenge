class Solution {
    public int[] countBits(int n) {

        System.out.println(n>>1);
        return new int[]{};
    }
}

/*
Note:
    - could possibly use memoization

    [diagram]
        - instansiate hashmap<Integer, int[]> cache
        - check if containskey(n), return cache.get(n)
        - if not...
            - instansiate int[] result = new int[n+1]
            - helper(n)
                - base case: if n = 0, result[n] = 0;
                             if n = 1, result[n] = 1;
                - recursive:
                    (ex. n=5)
                    instansiate int count = 0;
                    if n is odd, count++;
                    count = count + (n/2);

        - save result to cache
        - return result
*/

