class Solution {
    Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {

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
        }

        return fib(n - 1) + fib(n - 2);
    }
}

/*
Note:
    n is bigger than 0, smaller than 30
    (doesnt consider negavite numbers)
*/