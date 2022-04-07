class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(len(nums)):
            # ans[i] = nums[nums[i]] --- will raise exception
            ans.append(nums[nums[i]])
        return ans

'''
 0 1 2 3 4 5
[0,2,1,5,3,4]
nums[0] = 0,
nums[2] = 1,
nums[1] = 2,
nums[5] = 4,
nums[3] = 5,
nums[4] = 3,

loop through with index
    for i in len(nums)
ans[i] = nums[i]

'''