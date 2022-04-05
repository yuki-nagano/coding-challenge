class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i >= word2.length()) {
                sb.append(word1.charAt(i));
            } else if (i >= word1.length()) {
                sb.append(word2.charAt(i));
            } else {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
/*
Note:
    012345
    a
    i
    pqr
    j
*/