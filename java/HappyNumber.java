class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public boolean isHappy(int n) {
        while (n != 1 || n > 0) {
            if (n == 0 || n / 10 == 0 && n % 10 == 0) return false;
            if (n >= 100) {

            }

            int a = n % 10;
            int b = n / 10;
            if (!map.containsKey(a)) {
                map.put(a, a*a);
            }
            if (!map.containsKey(b)) {
                map.put(b, b*b);
            }

            a = map.get(a);
            bmap.get(b);
            System.out.println(n + " ");
        }

        return true;
    }

    private List<Integer> getEachDigit(int n) {
        while (n > 10) {
            n /= 10;
        }
    }
}
/*
Note:
    - positive num when sum of squares each digit
    - keep doing sum with squares until getting 1 or loop without 1

    n = 19
    n % 10 = 9 -> 9*9 -> map.put(9, 9*9)
    n / 10 = 1 -> 1*1 -> map.put(1, 1*1)

    while (n != 1) {
        if (n == 0 || n / 10 == 0) {
            return false;
        }

        int a = n % 10;
        int b = n / 10;
        if (!map.containsKey(a)) {
            map.put(a, a*a);
        } else if (!map.containsKey(b)) {
            map.put(b, b*b);
        }
        n = map.get(a) + map.get(b);
    }
    return true;



*/