class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        n = 0
        for v in operations:
            if v.find('--') > -1:
                n -= 1
            else:
                n += 1
        return n

'''
n starts from 0
loop thru
    if it's -,
    n -= 1
    elif +,
    n += 1

'''