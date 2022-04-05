class Solution {

    public static void main(String[] args) {
        /*
            "aa" "b" - false
            "aab" "ab" - false
            "aab" "abb" - false
            "aab" "aba" - true
            */
        System.out.println(isAnagram("aa", "b"));
        System.out.println(isAnagram("aab", "ab"));
        System.out.println(isAnagram("aab", "abb"));
        System.out.println(isAnagram("tttb", "ttbtd"));
    }

    private static boolean isAnagram(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if (a.length() != b.length()) return false;
        // n
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }

        // 3n + nlogn
        // O(1) (26)

        char[] bs = b.toCharArray();
        Arrays.sort(bs); // n log n
        // n
        for (char c: bs) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        // n
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != map2.get(entry.getKey() )) {
                return false;
            }
        }
        return true;
    }
}
/*
Note:
    Anagram
    input 2 strings (no empty strings)
    output boolean (whether it's anagram)

    - you can make some new strings that use 2 strings
    "aa" "b" - false
    "aab" "ab" - false
    "aab" "abb" - false

    "aab" "aba" - true
    count frequency of each letter of the first string
    a: 2
    b: 1

    diagram
    - count frequency of each letter in the first string
    - sort the second string
    - check the frequency of each letter
    - if all each letter is the same as the count in map, return true

*/