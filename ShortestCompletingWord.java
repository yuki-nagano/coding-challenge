class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

    }
}
/*
put it to lowercase
get the target letters -> store them to a map?
licensePlate = "1s3 PSt",
{
    s: 3,
    p: 1,
    t: 1,
}
loop through each word by char
if encountering the letter, map.get(char) - 1
words = ["step","steps","stripe","stepple"]

*/