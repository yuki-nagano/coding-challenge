class Solution {

    Map<Character, Integer> map = new HashMap<>();
    boolean result = true;

    public boolean makeEqual(String[] words) {
        if (words.length == 1) return true;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++)
                if (map.containsKey(words[i].charAt(j))) {
                    map.put(words[i].charAt(j), map.get(words[i].charAt(j)) + 1);
                } else {
                    map.put(words[i].charAt(j), 1);
                }
        }

        map.forEach((k, v) -> {
            if (v % words.length != 0) {
                result = false;
            }
        });

        return result;
    }
}

/*
Note:
    map {char: frequency}
    if the frequency is even, return true
diagramming
    - if words.lengh == 1, return true
    - loop through array with each char
    - if map.contansKey(char), put char, 1
    - else put char, get + 1
    - map.forEach(k, v) -> {
        if k % 2 != 0
            false
    }
    return true;
*/