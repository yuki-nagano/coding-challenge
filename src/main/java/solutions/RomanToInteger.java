package solutions;

import java.util.*;

/**
 * 13. Roman to Integer
 * src: https://leetcode.com/problems/roman-to-integer/
 *
 */

public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                result += map.get(c);

                // case for related to 4 and 9
                if (i > 0) {
                    if (map.get(c) > map.get(s.charAt(i - 1))) {
                        switch (c) {
                            case 'V':
                            case 'X':
                                result -= 2;
                                break;
                            case 'L':
                            case 'C':
                                result -= 20;
                                break;
                            case 'D':
                            case 'M':
                                result -= 200;
                                break;
                        }
                    }
                }
            } else {
                return 0;
            }
        }
        return result;
    }
}
