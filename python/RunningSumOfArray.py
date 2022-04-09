class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        next = 0
        for i in range(len(nums)):
            next += nums[i]
            nums[i] = next
        return nums

'''
nums = [1,2,3,4]
 1  1+2
[1, 1+2, 1+2+3, 1+2+3+4]
[1,3,6,10]
next += n
append(next)
'''
