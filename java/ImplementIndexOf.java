class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        /*   01234
            "aaa"
             i
            "a"
             j
        */

        int i = 0;
        int j = 0;
        int resultIndex = 0;
        while (i < heystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                resultIndex = i;
                if (j + 1 < needle.legnth()) {
                    // recursion?
                } else {
                    return resultIndex;
                }
            }
            i++;
        }
        return -1;
    }
}

/*
 Note:
    all lowercase
    haystack can be 0
    if needle == "", return 0
   */