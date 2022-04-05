class Solution {

    char[] temp;

    public void reverseString(char[] s) {
        temp = s;
        s = helper(s, temp, 0, s.length - 1);
    }

    private char[] helper(char[] s, char[] temp, int i, int j) {
        if (i == s.length - 1) { // i=5, j=0
            s[j] = temp[i];
            return s;
        } else {
            s = helper(s, temp, i++, j--);
            j++;
            i--;
            s[j] = temp[i];
        }
        return s;
    }
}
/*
Note:         i               j
    Input : ["o","l","l","e","h"]
    temp  : ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]

    Recursion
        Base case:
            if the index is at the last (length - 1)
            print it
        recursive case:
            helper(s[s.length - 1], s.length - 1)

*/