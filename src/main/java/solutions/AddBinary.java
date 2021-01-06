package solutions;

public class AddBinary {

    public static String addBinary(String a, String b) {

        // easy approach - using parseInt  O(N + M)
        // str -> int, sum
        // int -> str(binary)
        int sum = Integer.parseInt(a,2) + Integer.parseInt(b,2);
        String result = Integer.toBinaryString(sum);
        return result;

        /**
         *  The problem of this solution:
         *  if a is too big and b will not fit anymore
         *  need to improve
         */

    }
}


