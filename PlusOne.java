class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int n : digits) {
            sb.append(n);
        }
        int a = Integer.parseInt(sb.toString());
        return new int[3];
    }
}
/*
Note:
    1 <= digits.length <= 100
        which means it can be more than MAX_VALUE

    int[] result
    if digits[0] == 9
        result = new int[digits.length + 1]
    else
        result = new int[digits.length]

    int left_num = 1;
    int cur_digit = result.length - 1;
    int first_d = 0;
    int second_d = 0;
    for (int i = digits.length - 1; i > 0; i--) {
            sum = digits[i] + left_num;
            if sum <= 10
                first_d = sum % 10; // 1
                second_d = sum / 10 // 10
                left_num = second_d;
            } else {
                first_d = sum;
                left_num = 0;
            }
            result[cur_digit] = first_d;
            cur_digit--;
        }

    if sum <= 10:
    result
    _ _ 9 0
      9 9 10
    l = 1


    int last_d = digits.length - 1
    sum = digits[last_d] + 1
    if sum <= 10
        for (int i = digits.length - 1; i > 0; i--) {
            digits[i]
        }
        digit1 = sum % 10
        digit2 = sum / 10
        in-place sum to digits[last_d]

    [1,9,9] + 1 = 2,0,0
*/