class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        for n in nums:
            ans.append(n)

        for n in nums:
            ans.append(n)

        return ans

'''
nums = [1,2,1]
ans = [1,2,1,1,2,1]
'''