class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (!set.contains(sentence.charAt(i))) {
                set.add(sentence.charAt(i));
            }
            if (set.size() == 26) return true;
        }
        return false;
    }
}
/*
Note:
    hashmap or hashset to put all of the letters
    and at last checking the size of set and if it's 26
    then true, otherwise false

[pseudo code]
    this time using set since we don't have to count occurance
    set = new set
    for (i; i < sentense.length; i++) {
        if !containskey(s.charAt(i)) {
            set.add(s.charAt(i));
        }
    }
    if set.size == alphabet size {
        return true;
    }
    false
*/