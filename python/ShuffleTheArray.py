class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []
        for i in range(n):
            result.append(nums[i])
            result.append(nums[n + i])
        return result

'''
        x1 x2 x3 y1 y2 y3
Input:  [2, 5, 1, 3, 4, 7], n = 3
Output: [2, 3, 5, 4, 1, 7]
        x1 y1 x2 y2 x3 y3
        
Ideas:
- add values in a new array
    split the array in half - can't
    loop with n
    append alternately
        nums[i] 0 1 2
        nums[n + i] 3 4 5
- in-place - better time and space
    swapping
    x1 x2 x3 y1 y2 y3
'''