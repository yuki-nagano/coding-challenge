class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        // s = abccd   goal = abdcc
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {

                for (int j = i; j < goal.length() - 1; j++) {
                    // Swapping the characters
                    char[] ch = s.toCharArray();
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                    System.out.println("s: " + s + ", " + "goal: " + goal);
                }
            }
        }
        return true;
    }
}
/*
Note:
    swap only once - i and j(how do we decide?)
    "abcd" "acbd"
    the compare target is goal

    s = "abcd" -> goal = "abdc"
    1. a and b: "bacd" x
    2. a and c: "cbad" x
    3. a and d ....
    maybe we can skip until the letter is different
    if you find the different letter
    loop through the letter and the rest of the letters swapping
    and see if the whole one is the same as goal
    0. skip a and b, and c and d are diffent
    1. if j is d, swap it and check

*/