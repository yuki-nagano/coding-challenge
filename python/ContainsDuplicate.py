class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        if len(nums) >= 2 and nums[0] == nums[1]:
            return True
        return False