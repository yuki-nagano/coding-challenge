class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        # logn bs or divide and conquer?
        i: int = 0
        j: int = len(nums) / 2
        while (j < i):
            # 1,3,
            # 5,7 6
            if nums[j] == target:
                return j
            elif nums[j] < target:
                if nums[j + 1] > target:
                    return j
                else:
                    nums = nums[j:len(nums)]
                    j = len(nums) / 2
            # elif nums[j] > target: