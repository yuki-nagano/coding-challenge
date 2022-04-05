class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                sb.append(t.charAt(j));
                if (sb.toString().equals(s)) {
                    return true;
                }
                i++;
            }
            j++;
        }
        return false;
    }

}
/*
Note:
 Two pointers

 [diagram]
      i
    "bc" "abac"
             j
 [pseudo code]
  StringBuilder sb;
  if (i == j) {
    sb.append(t.charAt[j]); // "bc"
    if (sb.toString == s) {
        return true;
    }
    i++;
  }
    j++;
}
*/