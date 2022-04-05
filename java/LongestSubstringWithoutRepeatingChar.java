class Solution {

    Set<Character> set = new HashSet<>();;
    int maxsub = 0;

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                maxsub = Math.max(count, maxsub);
                count = 0;
                set.clear(); // reset the element in set
                i--; // count start from the current element
            } else {
                count++;
                set.add(s.charAt(i));
            }
        }
        maxsub = Math.max(count, maxsub);
        return maxsub;
    }
}