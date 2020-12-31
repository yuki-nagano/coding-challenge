package solutions;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public static int reverse(int x) {

        // [need to improve] attempt: 12/31
        // pattern when overflow after reverse - like 1534236469
        // max value = 2147483647
        // min value = -2147483648

        // x = 12 -> expect: 321
        // result = 3;
        // pop = x % 10 = 2
        // temp = result * 10 + pop (30 + 2) ...

        StringBuilder sb = new StringBuilder();
        if (x < 0) {
           x *= -1;
           sb.append("-");
        } else if (x == 0) {
            sb.append(0);
        }

        // ex. 910 -> 91
        if (x % 10 == 0) {
            x /= 10;
        }

        int lastDigit = 0;
        while (x != 0) {
            lastDigit = x % 10;
            sb.append(lastDigit);
            x /= 10;
        }

        int result = 0;
        try {
            result = Integer.parseInt(sb.toString());
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;
    }


}
