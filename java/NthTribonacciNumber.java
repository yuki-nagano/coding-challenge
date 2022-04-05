class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = helper(n);
        cache.put(n, result);
        return result;
    }

    private int helper(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        return helper(n-1)+helper(n-2)+helper(n-3);
    }
}
/*
Note:
    T0 -> 0 (possibly base case)
    T1 -> 1 (possibly base case)
    T2 -> 1 (possibly base case)
    T3 -> 2 (0+1+1) // T0+T1+T2
    T4 -> 4 (1+1+2) // T1+T2+T3
    T5 -> 7 (1+2+4) // T2+T3+T4

    - could possibly use dinamic programming/memoization
    - base case
        if T0, T1, T2, return number
    - recursive case (ex. n=3)
        tribonacci(n-1)+(n-2)+(n-3)

*/