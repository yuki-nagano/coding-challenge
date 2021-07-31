class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < dominoes.length; i++) {
            String key = dominoes[i][0] + "_" + dominoes[i][1]; // first_second
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                result = map.get(key);
            } else {
                map.put(key, 0);
            }

        }

        for (int i = 0; i < dominoes.length; i++) {
            String keyReversed = dominoes[i][1] + "_" + dominoes[i][0]; // second_first
            // System.out.println(key);
            if (map.containsKey(keyReversed)) {
                map.put(keyReversed, map.get(keyReversed) + 1);
                if (result < map.get(keyReversed)) {
                    result = map.get(keyReversed);
                }
            }
        }

        return result;
    }
}
/*
Note:
    - put everything into hashmap(i_j, count)
        // string : "i_j"
        // integer: 0 (count)
    - create a key with reversed order(ex. j_i)
    - check if it matches

     i j
    [1,2],[2,1],[3,4],[5,6]
*/