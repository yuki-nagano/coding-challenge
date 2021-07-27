class Solution {
    public String largestOddNumber(String num) {

        // when using parse int:
        // think about when the num is bigger than MAX_VALUE

        int intNum = Integer.parseInt(num); // O(n)
        if ((intNum % 10) % 2 != 0) {
            return num;
        }

        while (intNum > 0) {
            intNum /= 10;
            if (intNum % 2 != 0) {
                return Integer.toString(intNum); // O(n)
            }
        }

        return "";
    }
}

/*
Note:
    check if its an
    odd number, return the num
    even number,
    compare with the
    edge cases
    - if no odd int, return ""
    */