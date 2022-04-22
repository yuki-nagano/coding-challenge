class Solution:
    def maximumSwap(self, num: int) -> int:
        # make each digit an array
        each_digit = [int(x) for x in list(str(num))]
        max_i = 0
        for i in range(len(each_digit)):
            cur_max = 0
            for j in range(i + 1, len(each_digit)):
                if (cur_max <= each_digit[j]):
                    cur_max = each_digit[j]
                    max_i = j
            if (each_digit[i] < cur_max):
                each_digit[i], each_digit[max_i] = each_digit[max_i], each_digit[i]
                # back to int from the array
                cur_num = int(reduce(lambda x, y: x + y, [str(x) for x in each_digit]))
                return max(cur_num, num)

        return num

# cur_max = 9
# max_j = 2

#  i
#  1993
#   j


'''
1234
4231

put each digit to an array
for each
    # find the cur_max num
    curmax(cur_digit, cur_max)
        if yes, the second one
4321

'''