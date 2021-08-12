class Solution {

    public HashMap<Integer, int[]> cache = new HashMap<>();
    public int[] result;

    public int[] countBits(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        result = new int[n+1];
        helper(n);
        cache.put(n, result);
        return result;
    }

    private void helper(int n) {
        if (n < 0) return;

        String nStr = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < nStr.length(); i++) {
            if (nStr.charAt(i) == '1') {
                count++;
            }
        }
        helper(n - 1);
        result[n] = count;
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
                             if n = 1, result[n] = 1; (or just 0)
                - recursive:
                    toBinaryString(n)
                    count1 with for loop

        - save result to cache
        - return result
*/

/* 1st attempt
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

