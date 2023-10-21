class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        cool_pairs: int = 0
        i: int = 0
        j: int = 1
        while i < j and j < len(nums):
            if i < j and (nums[i] + nums[j] < target):
                cool_pairs += 1
            j += 1
            if j == len(nums):
                i += 1
                j = i + 1
        return cool_pairs

"""
sliding window -ish
i: int = 0
j: int = 1
  0 1 2 3 4 5
[-1,1,2,3,1]
          i 
            j
while i < j:
    if i < j and nums[i] + nums[j] < target:
        cool_pairs += 1
    j += 1
    if j > len(nums):
        i += 1
        j = i + 1
"""
